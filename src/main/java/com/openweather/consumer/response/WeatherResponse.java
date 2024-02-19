/**
 * @(#) WeatherResponse.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherResponse.java
 * Description: Clase genérica para ser utilizada como transportadora de informacion.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.response;

import java.io.Serializable;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.response
 */
@SuppressWarnings("serial")
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

	/**
	 * Full constructor
	 * 
	 * @param code
	 * @param status
	 * @param message
	 * @param data
	 */
	public WeatherResponse(final Integer code, final String status, final String message, final T data) {
		super();
		this.code = code;
		this.status = status;
		this.message = message;
		this.data = data;
	}

	// Property accessors
	/**
	 * Método de obtención del código del servicio
	 * 
	 * @return código del servicio
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Método de establecimiento para el código del servicio
	 * 
	 * @param code
	 */
	public void setCode(final Integer code) {
		this.code = code;
	}

	/**
	 * Método de obtención del estatus del servicio
	 * 
	 * @return estatus del servicio
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Método de establecimiento para el estatus del servicio
	 * 
	 * @param status
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * Método de obtención del mensaje descriptivo del servicio
	 * 
	 * @return mensaje descriptivo del servicio
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Método de establecimiento para el mensaje descriptivo del servicio
	 * 
	 * @param message
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * Método de obtención de los datos retornados del servicio
	 * 
	 * @return datos retornados del servicio
	 */
	public T getData() {
		return data;
	}

	/**
	 * Método de establecimiento para los datos retornados del servicio
	 * 
	 * @param data
	 */
	public void setData(final T data) {
		this.data = data;
	}
}