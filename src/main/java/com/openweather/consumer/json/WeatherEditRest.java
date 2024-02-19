/**
 * @(#) WeatherEditRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherEditRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la petición del servicio que obtiene el estado del clima.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.json
 */
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherEditRest implements Serializable {

	// Fields
	@JsonProperty("cityName")
	@NotEmpty(message = "El campo [cityName] es requerido para la operación.")
	private String cityName;

	// Property accessors
	/**
	 * Método de obtención de la propiedad cityName
	 * 
	 * @return String cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Método de establecimiento para la propiedad cityName
	 * 
	 * @param String cityName
	 */
	public void setCityName(final String cityName) {
		this.cityName = cityName;
	}
}