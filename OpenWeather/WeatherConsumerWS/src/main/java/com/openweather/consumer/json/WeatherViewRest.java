/**
 * @(#) WeatherViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherViewRest.java
 * Description: Clase para ser utilizada como transportadora de informaci�n 
 * 				relacionada a las condiciones del clima.
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
public class WeatherViewRest implements Serializable {

	// Fields
	@JsonProperty("id")
	private Long id;
	@JsonProperty("main")
	private String main;
	@JsonProperty("description")
	private String description;
	@JsonProperty("icon")
	private String icon;

	// Property accessors
	/**
	 * M�todo de obtenci�n de la propiedad id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * M�todo de establecimiento para la propiedad id
	 * 
	 * @param Long id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * M�todo de obtenci�n de la propiedad main
	 * 
	 * @return String main
	 */
	public String getMain() {
		return main;
	}

	/**
	 * M�todo de establecimiento para la propiedad main
	 * 
	 * @param String main
	 */
	public void setMain(final String main) {
		this.main = main;
	}

	/**
	 * M�todo de obtenci�n de la propiedad description
	 * 
	 * @return String description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * M�todo de establecimiento para la propiedad description
	 * 
	 * @param String description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * M�todo de obtenci�n de la propiedad icon
	 * 
	 * @return String icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * M�todo de establecimiento para la propiedad icon
	 * 
	 * @param String icon
	 */
	public void setIcon(final String icon) {
		this.icon = icon;
	}
}