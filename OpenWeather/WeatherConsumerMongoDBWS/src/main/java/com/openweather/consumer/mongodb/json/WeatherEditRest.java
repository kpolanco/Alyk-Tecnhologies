/**
 * @(#) WeatherEditRest.java
 *
 * Project: WeatherConsumerMongoDBWS
 * Title: Clase WeatherEditRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la petición del servicio que obtiene el estado del clima.
 * Copyright: Copyright(c) 10/02/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.mongodb.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
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
public class WeatherEditRest implements Serializable {

	// Fields
	@JsonProperty("cityName")
	@NotEmpty(message = "El campo [cityName] es requerido para la operación.")
	private String cityName;
}