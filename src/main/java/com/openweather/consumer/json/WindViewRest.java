/**
 * @(#) WindViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WindViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada al fenómeno atmosférico del viento.
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
public class WindViewRest implements Serializable {

	// Fields
	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Long deg;
	@JsonProperty("gust")
	private Double gust;

	// Property accessors
	/**
	 * Método de obtención de la propiedad speed
	 * 
	 * @return Double speed
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * Método de establecimiento para la propiedad speed
	 * 
	 * @param Double speed
	 */
	public void setSpeed(final Double speed) {
		this.speed = speed;
	}

	/**
	 * Método de obtención de la propiedad deg
	 * 
	 * @return Long deg
	 */
	public Long getDeg() {
		return deg;
	}

	/**
	 * Método de establecimiento para la propiedad deg
	 * 
	 * @param Long deg
	 */
	public void setDeg(final Long deg) {
		this.deg = deg;
	}

	/**
	 * Método de obtención de la propiedad gust
	 * 
	 * @return Double gust
	 */
	public Double getGust() {
		return gust;
	}

	/**
	 * Método de establecimiento para la propiedad gust
	 * 
	 * @param Double gust
	 */
	public void setGust(final Double gust) {
		this.gust = gust;
	}
}