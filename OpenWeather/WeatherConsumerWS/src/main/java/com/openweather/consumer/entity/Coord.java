/**
 * @(#) Coord.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Coord.java
 * Description: Entidad Relacional de la Tabla [COORD]
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
 * Entidad Relacional de la Tabla [COORD]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "COORD")
public class Coord implements Serializable {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "LON", nullable = false)
	private Double lon;
	@Column(name = "LAT", nullable = false)
	private Double lat;
	@OneToOne(mappedBy = "coord")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Coord() {
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
	 * Método de obtención de la propiedad lon
	 * 
	 * @return Double lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * Método de establecimiento para la propiedad lon
	 * 
	 * @param Double lon
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

	/**
	 * Método de obtención de la propiedad lat
	 * 
	 * @return Double lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * Método de establecimiento para la propiedad lat
	 * 
	 * @param Double lat
	 */
	public void setLat(Double lat) {
		this.lat = lat;
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