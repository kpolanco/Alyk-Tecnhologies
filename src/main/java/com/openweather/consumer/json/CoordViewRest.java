/**
 * @(#) CoordViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase CoordViewRest.java
 * Description: Clase para ser utilizada como transportadora de informaci�n 
 * 				relacionada a la geolocalizaci�n de la ciudad.
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
public class CoordViewRest implements Serializable {

	// Fields
	@JsonProperty("lon")
	private Double lon;
	@JsonProperty("lat")
	private Double lat;

	// Property accessors
	/**
	 * M�todo de obtenci�n de la propiedad lon
	 * 
	 * @return Double lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * M�todo de establecimiento para la propiedad lon
	 * 
	 * @param Double lon
	 */
	public void setLon(final Double lon) {
		this.lon = lon;
	}

	/**
	 * M�todo de obtenci�n de la propiedad lat
	 * 
	 * @return Double lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * M�todo de establecimiento para la propiedad lat
	 * 
	 * @param Double lat
	 */
	public void setLat(final Double lat) {
		this.lat = lat;
	}
}