/**
 * @(#) Wind.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Wind.java
 * Description: Entidad Relacional de la Tabla [WIND]
 * Copyright: Copyright(c) 29/01/2023
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
 * Entidad Relacional de la Tabla [WIND]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "WIND")
public class Wind implements Serializable {
	  
	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "SPEED", nullable = false)
	private Double speed;
	@Column(name = "DEG", nullable = false)
	private Long deg;
	@Column(name = "GUST", nullable = true)
	private Double gust;
	@OneToOne(mappedBy = "wind")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Wind() {
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
	 * Método de obtención de la propiedad speed
	 * 
	 * @return Double speed
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * Método de establecimiento para la propiedad speed
	 * 
	 * @param Double speed
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/**
	 * Método de obtención de la propiedad deg
	 * 
	 * @return Long deg
	 */
	public Long getDeg() {
		return deg;
	}

	/**
	 * Método de establecimiento para la propiedad deg
	 * 
	 * @param Long deg
	 */
	public void setDeg(Long deg) {
		this.deg = deg;
	}

	/**
	 * Método de obtención de la propiedad gust
	 * 
	 * @return Double gust
	 */
	public Double getGust() {
		return gust;
	}

	/**
	 * Método de establecimiento para la propiedad gust
	 * 
	 * @param Double gust
	 */
	public void setGust(Double gust) {
		this.gust = gust;
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