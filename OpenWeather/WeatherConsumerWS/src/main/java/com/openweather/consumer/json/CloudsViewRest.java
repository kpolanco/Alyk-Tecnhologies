/**
 * @(#) CloudsViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase CloudsViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la nubosidad del momento.
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
public class CloudsViewRest implements Serializable {

	// Fields
	@JsonProperty("all")
	private Long all;

	// Property accessors
	/**
	 * Método de obtención de la propiedad all
	 * 
	 * @return Long all
	 */
	public Long getAll() {
		return all;
	}

	/**
	 * Método de establecimiento para la propiedad all
	 * 
	 * @param Long all
	 */
	public void setAll(final Long all) {
		this.all = all;
	}
}