/**
 * @(#) Main.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase Main.java
 * Description: Entidad Relacional de la Colección [main]
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
 * Entidad Relacional de la Colección [main]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "main")
@Data
public class Main implements Serializable {

	// Fields
	@Id
	private Long id;
	private Double temp;
	private Double feelsLike;
	private Double tempMin;
	private Double tempMax;
	private Long pressure;
	private Long humidity;
	private Long seaLevel;
	private Long grndLevel;
}