/**
 * @(#) CoordViewRest.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase CoordViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la geolocalización de la ciudad.
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.json
 */
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CoordViewRest implements Serializable {

	// Fields
	@JsonProperty("lon")
	private Double lon;
	@JsonProperty("lat")
	private Double lat;
}