/**
 * @(#) Sys.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Sys.java
 * Description: Entidad Relacional de la Tabla [SYS]
 * Copyright: Copyright(c) 30/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Entidad Relacional de la Tabla [SYS]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "SYS")
public class Sys implements Serializable {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "TYPE", nullable = false)
	private Long type;
	@Column(name = "COUNTRY", nullable = false, length = 60)
	private String country;
	@Column(name = "SUNRISE", nullable = false)
	private Long sunrise;
	@Column(name = "SUNSET", nullable = false)
	private Long sunset;
	@OneToOne(mappedBy = "sys")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Sys() {
	}

	// Property accessors
	/**
	 * Método de obtención de la propiedad id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método de establecimiento para la propiedad id
	 * 
	 * @param Long id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Método de obtención de la propiedad type
	 * 
	 * @return Long type
	 */
	public Long getType() {
		return type;
	}

	/**
	 * Método de establecimiento para la propiedad type
	 * 
	 * @param Long type
	 */
	public void setType(Long type) {
		this.type = type;
	}

	/**
	 * Método de obtención de la propiedad country
	 * 
	 * @return String country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Método de establecimiento para la propiedad country
	 * 
	 * @param String country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Método de obtención de la propiedad sunrise
	 * 
	 * @return Long sunrise
	 */
	public Long getSunrise() {
		return sunrise;
	}

	/**
	 * Método de establecimiento para la propiedad sunrise
	 * 
	 * @param Long sunrise
	 */
	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * Método de obtención de la propiedad sunset
	 * 
	 * @return Long sunset
	 */
	public Long getSunset() {
		return sunset;
	}

	/**
	 * Método de establecimiento para la propiedad sunset
	 * 
	 * @param Long sunset
	 */
	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}

	/**
	 * Método de obtención de la propiedad weatherCurrency
	 * 
	 * @return WeatherCurrency weatherCurrency
	 */
	public WeatherCurrency getWeatherCurrency() {
		return weatherCurrency;
	}

	/**
	 * Método de establecimiento para la propiedad weatherCurrency
	 * 
	 * @param WeatherCurrency weatherCurrency
	 */
	public void setWeatherCurrency(WeatherCurrency weatherCurrency) {
		this.weatherCurrency = weatherCurrency;
	}
}