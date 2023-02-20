/**
 * @(#) Coord.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase Coord.java
 * Description: Entidad Relacional de la Colección [coord]
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
 * Entidad Relacional de la Colección [coord]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "coord")
@Data
public class Coord implements Serializable {

	// Fields
	@Id
	private Long id;
	private Double lon;
	private Double lat;
}