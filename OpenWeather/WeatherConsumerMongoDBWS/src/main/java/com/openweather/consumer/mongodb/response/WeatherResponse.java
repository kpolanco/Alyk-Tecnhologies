/**
 * @(#) WeatherResponse.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherResponse.java
 * Description: Clase genérica para ser utilizada como transportadora de informacion.
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.response
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
public class WeatherResponse<T> implements Serializable {

	// Fields
	private Integer code;
	private String status;
	private String message;
	private T data;

	// Constructors
	/**
	 * Minimal constructor
	 * 
	 * @param code
	 * @param status
	 * @param message
	 */
	public WeatherResponse(final Integer code, final String status, final String message) {
		this.code = code;
		this.status = status;
		this.message = message;
	}
}