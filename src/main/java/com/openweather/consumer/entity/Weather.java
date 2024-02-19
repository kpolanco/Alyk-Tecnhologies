/**
 * @(#) Weather.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Weather.java
 * Description: Entidad Relacional de la Tabla [WEATHER]
 * Copyright: Copyright(c) 30/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.entity;

import java.io.Serializable;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entidad Relacional de la Tabla [WEATHER]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "WEATHER")
public class Weather implements Serializable {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "MAIN", nullable = false, length = 60)
	private String main;
	@Column(name = "DESCRIPTION", nullable = false, length = 150)
	private String description;
	@Column(name = "ICON", nullable = false, length = 5)
	private String icon;
	@ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "WEATHER_ID")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Weather() {
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
	 * Método de obtención de la propiedad main
	 * 
	 * @return String main
	 */
	public String getMain() {
		return main;
	}

	/**
	 * Método de establecimiento para la propiedad main
	 * 
	 * @param String main
	 */
	public void setMain(String main) {
		this.main = main;
	}

	/**
	 * Método de obtención de la propiedad description
	 * 
	 * @return String description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Método de establecimiento para la propiedad description
	 * 
	 * @param String description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Método de obtención de la propiedad icon
	 * 
	 * @return String icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * Método de establecimiento para la propiedad icon
	 * 
	 * @param String icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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