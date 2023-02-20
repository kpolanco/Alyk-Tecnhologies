/**
 * @(#) WeatherCurrency.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherCurrency.java
 * Description: Entidad Relacional de la Colección [weather_currency]
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Entidad Relacional de la Colección [weather_currency]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "weather_currency")
@Data
public class WeatherCurrency implements Serializable {

	// Fields
	@Id
	private Long id;
	private String name;
	private Long cod;
	private String base;
	private Long visibility;
	private Long dt;
	private Long timezone;
	private Date fechaRegistro;
	private Wind wind;
	private Clouds clouds;
	private Sys sys;
	private Coord coord;
	private Main main;
	private List<Weather> weathers;
}