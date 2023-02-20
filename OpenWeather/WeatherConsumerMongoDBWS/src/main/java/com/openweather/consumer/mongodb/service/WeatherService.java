/**
 * @(#) WeatherService.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Interfaz WeatherService.java
 * Description: Definira los servicios a consultar del API OpenWeather
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.service;

import java.util.List;

import com.openweather.consumer.mongodb.json.WeatherCurrencyViewRest;
import com.openweather.consumer.mongodb.response.WeatherResponse;

/**
 * Declara firma de metodos de Servicios
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.service
 */
public interface WeatherService {

	/**
	 * Invoca al servicio que almacena los datos meteorológicos actuales de una
	 * ciudad en BD.
	 * 
	 * @param cityName
	 * @return WeatherResponse<WeatherCurrencyViewRest>
	 */
	public WeatherResponse<WeatherCurrencyViewRest> createWeatherCurrency(final String cityName);

	/**
	 * Invoca al servicio que busca los datos meteorol�meteorológicos actuales de una ciudad
	 * desde el API de OpenWeather.
	 * 
	 * @param cityName
	 * @return WeatherResponse<WeatherCurrencyViewRest>
	 */
	public WeatherResponse<WeatherCurrencyViewRest> getWeatherCurrencyByCityName(final String cityName);

	/**
	 * Invoca al servicio que obtiene el listado de los 10 últimos registros
	 * realizados en BD.
	 * 
	 * @return WeatherResponse<List<WeatherCurrencyViewRest>>
	 */
	public WeatherResponse<List<WeatherCurrencyViewRest>> findLastTenRecords();
}