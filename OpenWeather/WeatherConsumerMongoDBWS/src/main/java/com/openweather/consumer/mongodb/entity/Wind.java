/**
 * @(#) Wind.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase Wind.java
 * Description: Entidad Relacional de la Colección [wind]
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
 * Entidad Relacional de la Colección [wind]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "wind")
@Data
public class Wind implements Serializable {

	// Fields
	@Id
	private Long id;
	private Double speed;
	private Long deg;
	private Double gust;
}