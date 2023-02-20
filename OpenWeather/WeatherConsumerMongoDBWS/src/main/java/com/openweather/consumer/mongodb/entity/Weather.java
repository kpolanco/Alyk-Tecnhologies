/**
 * @(#) Weather.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase Weather.java
 * Description: Entidad Relacional de la Colección [weather]
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Entidad Relacional de la Colección [weather]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "weather")
@Data
public class Weather implements Serializable {

	// Fields
	@Id
	private Long id;
	private String main;
	private String description;
	private String icon;
}