/**
 * @(#) MainViewRest.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase MainViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la temperatura, presión atmosférica, humedad 
 * 				y nivel del mar.
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
public class MainViewRest implements Serializable {

	// Fields
	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("feels_like")
	private Double feelsLike;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;
	@JsonProperty("pressure")
	private Long pressure;
	@JsonProperty("humidity")
	private Long humidity;
	@JsonProperty("sea_level")
	private Long seaLevel;
	@JsonProperty("grnd_level")
	private Long grndLevel;
}