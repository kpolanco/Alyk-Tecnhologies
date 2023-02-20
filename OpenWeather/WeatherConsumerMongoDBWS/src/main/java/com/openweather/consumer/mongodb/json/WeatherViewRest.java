/**
 * @(#) WeatherViewRest.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a las condiciones del clima.
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
}