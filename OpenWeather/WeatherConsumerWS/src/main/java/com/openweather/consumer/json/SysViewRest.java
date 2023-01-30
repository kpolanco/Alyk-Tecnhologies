/**
 * @(#) SysViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase SysViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a las condiciones del clima en el día.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.json
 */
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysViewRest implements Serializable {

	// Fields
	@JsonProperty("type")
	private Long type;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("country")
	private String country;
	@JsonProperty("sunrise")
	private Long sunrise;
	@JsonProperty("sunset")
	private Long sunset;

	// Property accessors
	/**
	 * Método de obtención de la propiedad type
	 * 
	 * @return Long type
	 */
	public Long getType() {
		return type;
	}

	/**
	 * Método de establecimiento para la propiedad type
	 * 
	 * @param Long type
	 */
	public void setType(final Long type) {
		this.type = type;
	}

	/**
	 * Método de obtención de la propiedad id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método de establecimiento para la propiedad id
	 * 
	 * @param Long id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Método de obtención de la propiedad country
	 * 
	 * @return String country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Método de establecimiento para la propiedad country
	 * 
	 * @param String country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * Método de obtención de la propiedad sunrise
	 * 
	 * @return Long sunrise
	 */
	public Long getSunrise() {
		return sunrise;
	}

	/**
	 * Método de establecimiento para la propiedad sunrise
	 * 
	 * @param Long sunrise
	 */
	public void setSunrise(final Long sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * Método de obtención de la propiedad sunset
	 * 
	 * @return Long sunset
	 */
	public Long getSunset() {
		return sunset;
	}

	/**
	 * Método de establecimiento para la propiedad sunset
	 * 
	 * @param Long sunset
	 */
	public void setSunset(final Long sunset) {
		this.sunset = sunset;
	}
}