/**
 * @(#) WeatherServiceImpl.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherServiceImpl.java
 * Description: Clase que consume los servicios de consulta climatologica del API OpenWeather, 
 * 				y ejecuta las consultas y/o transacciones de la coleccion [weather_currency] de la BD del Weather, 
 * 				por último proporciona los datos generales del clima.
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.service.impl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.openweather.consumer.mongodb.dao.WeatherDao;
import com.openweather.consumer.mongodb.entity.WeatherCurrency;
import com.openweather.consumer.mongodb.json.WeatherCurrencyViewRest;
import com.openweather.consumer.mongodb.response.WeatherResponse;
import com.openweather.consumer.mongodb.service.WeatherService;
import com.openweather.consumer.mongodb.util.MessageUtil;

import lombok.RequiredArgsConstructor;

/**
 * Implementadora de interfaz de servicios
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.service.impl
 */
@Service("weatherService")
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

	// Property Fields Logger
	private static final Logger log = LoggerFactory.getLogger(WeatherServiceImpl.class.getName());

	// Constantes usadas para el mapeo entre objetos
	private static final ModelMapper modelMapper = new ModelMapper();

	// Property Fields
	@Value(value = "${WEATHER_API_URL}")
	private String weatherApiUrl;
	@Value(value = "${WEATHER_APP_ID}")
	private String weatherAppId;
	@Autowired
	private final MessageUtil messageUtil;
	@Autowired
	private final WeatherDao weatherDao;

	/**
	 * Invoca al servicio que almacena los datos meteorológicos actuales de una
	 * ciudad en BD.
	 * 
	 * @param cityName
	 * @return WeatherResponse<WeatherCurrencyViewRest>
	 */
	public WeatherResponse<WeatherCurrencyViewRest> createWeatherCurrency(final String cityName) {
		final Optional<WeatherCurrency> opWeatherCurrency = this.weatherDao.findByCityName(cityName);
		if (opWeatherCurrency.isPresent()) {
			final WeatherCurrencyViewRest weatherCurrencyRest = modelMapper.map(opWeatherCurrency.get(),
				WeatherCurrencyViewRest.class);
			return new WeatherResponse<>(0, "Success", this.messageUtil.getSuccessOperation(), weatherCurrencyRest);
		} else {
			return new WeatherResponse<>(HttpStatus.NO_CONTENT.value(), "Failure",
				this.messageUtil.getObjectDoesNotExistsNothing(cityName));
		}
	}

	/**
	 * Invoca al servicio que busca los datos meteorológicos actuales de una ciudad
	 * desde el API de OpenWeather.
	 * 
	 * @param cityName
	 * @return WeatherResponse<WeatherCurrencyViewRest>
	 */
	@Transactional
	public WeatherResponse<WeatherCurrencyViewRest> getWeatherCurrencyByCityName(final String cityName) {
		final String urlService = MessageFormat.format(this.weatherApiUrl, cityName, this.weatherAppId);

		try {
			final RestTemplate restTemplate = new RestTemplate();
			final ResponseEntity<WeatherCurrencyViewRest> response = restTemplate.exchange(
				urlService, HttpMethod.GET, null,
				new ParameterizedTypeReference<WeatherCurrencyViewRest>() {});
			final WeatherCurrencyViewRest weatherCurrencyRest = response.getBody();

			try {
				final WeatherCurrency weatherCurrency = modelMapper.map(weatherCurrencyRest, WeatherCurrency.class);
				weatherCurrency.setFechaRegistro(new Date());
				this.weatherDao.save(weatherCurrency);
			} catch (final Exception ex) {
				log.error(this.messageUtil.getFailureSaveObject("WeatherCurrency"), ex);
			}
			return new WeatherResponse<>(0, "Success", this.messageUtil.getSuccessOperation(), weatherCurrencyRest);
		} catch (final RestClientException ex) {
			log.error(this.messageUtil.getFailureSaveObject("WeatherCurrency"), ex);
			return this.createWeatherCurrency(cityName);
		} catch (final Exception ex) {
			log.error(this.messageUtil.getFailureSaveObject("WeatherCurrency"), ex);
			return this.createWeatherCurrency(cityName);
		}
	}

	/**
	 * Invoca al servicio que obtiene el listado de los 10 últimos registros
	 * realizados en BD.
	 * 
	 * @return WeatherResponse<List<WeatherCurrencyViewRest>>
	 */
	@Transactional
	public WeatherResponse<List<WeatherCurrencyViewRest>> findLastTenRecords() {
		final List<WeatherCurrency> weatherCurrencies = this.weatherDao.findLastTenRecords();
		if (weatherCurrencies != null && !weatherCurrencies.isEmpty()) {
			final List<WeatherCurrencyViewRest> weatherCurrencyRests = new ArrayList<>();
			weatherCurrencies.forEach(
				weather -> weatherCurrencyRests.add(modelMapper.map(weather, WeatherCurrencyViewRest.class)));
			return new WeatherResponse<>(0, "Success", this.messageUtil.getSuccessOperation(), weatherCurrencyRests);
		}
		return new WeatherResponse<>(HttpStatus.NO_CONTENT.value(), "Failure", messageUtil.getListDoesNotExists());
	}
}