/**
 * @(#) WeatherController.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherController.java
 * Description: Clase que proporciona los servicios web que publica 
 * 				los datos meteorol�gicos actuales.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.openweather.consumer.json.WeatherCurrencyViewRest;
import com.openweather.consumer.json.WeatherEditRest;
import com.openweather.consumer.response.WeatherResponse;
import com.openweather.consumer.service.WeatherService;
import com.openweather.consumer.util.ValidateField;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Validator;

/**
 * Controlador del servicio Weather
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.controller
 */
@RestController
@CrossOrigin(origins = "${WEATHER_WS_SERVER}")
@RequestMapping(path = "/weather/v1")
public class WeatherController {

	@Autowired
	private Validator validator;
	@Autowired
	private WeatherService weatherService;

	/**
	 * Servicio que obtiene los datos meteorol�gicos actuales de una ciudad.
	 * 
	 * @param token
	 * @return FundsResponse<TokenViewRest>
	 */
	@SuppressWarnings("unchecked")
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "get-weather-currency-by-city", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Obtiene los datos meteorol�gicos actuales de una ciudad.")
	public WeatherResponse<WeatherCurrencyViewRest> getWeatherCurrencyByCityName(
			@RequestBody(required = true) final WeatherEditRest weatherRest) {
		final ValidateField<WeatherEditRest> validateField = new ValidateField<>(this.validator);
		if (!validateField.isValidateRequest(weatherRest)) {
			return (WeatherResponse<WeatherCurrencyViewRest>) validateField.getWeatherResponse();
		}
		return this.weatherService.getWeatherCurrencyByCityName(weatherRest.getCityName());
	}

	/**
	 * Servicio que obtiene el listado de los 10 �ltimos registros realizados en BD.
	 * 
	 * @return WeatherResponse<List<WeatherCurrencyViewRest>>
	 */
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "find-last-ten-records", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Obtiene el listado de los 10 �ltimos registros realizados en BD.")
	public WeatherResponse<List<WeatherCurrencyViewRest>> findLastTenRecords() {
		return this.weatherService.findLastTenRecords();
	}
}