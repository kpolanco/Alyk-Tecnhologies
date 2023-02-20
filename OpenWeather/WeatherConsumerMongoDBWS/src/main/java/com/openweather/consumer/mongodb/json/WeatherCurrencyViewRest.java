/**
 * @(#) WeatherCurrencyViewRest.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherCurrencyViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la respuesta del servicio que obtiene el estado del clima.
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.json;

import java.io.Serializable;
import java.util.List;

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
public class WeatherCurrencyViewRest implements Serializable {

	// Fields
	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private Long cod;
	@JsonProperty("base")
	private String base;
	@JsonProperty("visibility")
	private Long visibility;
	@JsonProperty("dt")
	private Long dt;
	@JsonProperty("timezone")
	private Long timezone;
	@JsonProperty("wind")
	private WindViewRest wind;
	@JsonProperty("clouds")
	private CloudsViewRest clouds;
	@JsonProperty("sys")
	private SysViewRest sys;
	@JsonProperty("coord")
	private CoordViewRest coord;
	@JsonProperty("main")
	private MainViewRest main;
	@JsonProperty("weather")
	private List<WeatherViewRest> weathers;
}