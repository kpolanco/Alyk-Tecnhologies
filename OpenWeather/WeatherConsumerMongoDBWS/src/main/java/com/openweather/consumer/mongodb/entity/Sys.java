/**
 * @(#) Sys.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase Sys.java
 * Description: Entidad Relacional de la Colección [sys]
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
 * Entidad Relacional de la Colección [sys]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.mongodb.entity
 */
@SuppressWarnings("serial")
@Document(collection = "sys")
@Data
public class Sys implements Serializable {

	// Fields
	@Id
	private Long id;
	private Long type;
	private String country;
	private Long sunrise;
	private Long sunset;
}