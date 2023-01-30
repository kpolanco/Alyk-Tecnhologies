/**
 * @(#) Clouds.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Clouds.java
 * Description: Entidad Relacional de la Tabla [CLOUDS]
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
 * Entidad Relacional de la Tabla [CLOUDS]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "CLOUDS")
public class Clouds implements Serializable {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "ALL_CLOUDS", nullable = false)
	private Long all;
	@OneToOne(mappedBy = "clouds")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Clouds() {
		super();
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
	 * Método de obtención de la propiedad all
	 * 
	 * @return Long all
	 */
	public Long getAll() {
		return all;
	}

	/**
	 * Método de establecimiento para la propiedad all
	 * 
	 * @param Long all
	 */
	public void setAll(Long all) {
		this.all = all;
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