/**
 * @(#) Main.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase Main.java
 * Description: Entidad Relacional de la Tabla [MAIN]
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
 * Entidad Relacional de la Tabla [MAIN]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "MAIN")
public class Main implements Serializable {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "TEMP", nullable = false)
	private Double temp;
	@Column(name = "FEELS_LIKE", nullable = false)
	private Double feelsLike;
	@Column(name = "TEMP_MIN", nullable = false)
	private Double tempMin;
	@Column(name = "TEMP_MAX", nullable = false)
	private Double tempMax;
	@Column(name = "PRESSURE", nullable = false)
	private Long pressure;
	@Column(name = "HUMIDITY", nullable = false)
	private Long humidity;
	@Column(name = "SEA_LEVEL", nullable = true)
	private Long seaLevel;
	@Column(name = "GRND_LEVEL", nullable = true)
	private Long grndLevel;
	@OneToOne(mappedBy = "main")
	private WeatherCurrency weatherCurrency;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public Main() {
		super();
	}

	// Property accessors
	/**
	 * M�todo de obtenci�n de la propiedad id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * M�todo de establecimiento para la propiedad id
	 * 
	 * @param Long id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * M�todo de obtenci�n de la propiedad temp
	 * 
	 * @return Double temp
	 */
	public Double getTemp() {
		return temp;
	}

	/**
	 * M�todo de establecimiento para la propiedad temp
	 * 
	 * @param Double temp
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	/**
	 * M�todo de obtenci�n de la propiedad feelsLike
	 * 
	 * @return Double feelsLike
	 */
	public Double getFeelsLike() {
		return feelsLike;
	}

	/**
	 * M�todo de establecimiento para la propiedad feelsLike
	 * 
	 * @param Double feelsLike
	 */
	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	/**
	 * M�todo de obtenci�n de la propiedad tempMin
	 * 
	 * @return Double tempMin
	 */
	public Double getTempMin() {
		return tempMin;
	}

	/**
	 * M�todo de establecimiento para la propiedad tempMin
	 * 
	 * @param Double tempMin
	 */
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}

	/**
	 * M�todo de obtenci�n de la propiedad tempMax
	 * 
	 * @return Double tempMax
	 */
	public Double getTempMax() {
		return tempMax;
	}

	/**
	 * M�todo de establecimiento para la propiedad tempMax
	 * 
	 * @param Double tempMax
	 */
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}

	/**
	 * M�todo de obtenci�n de la propiedad pressure
	 * 
	 * @return Long pressure
	 */
	public Long getPressure() {
		return pressure;
	}

	/**
	 * M�todo de establecimiento para la propiedad pressure
	 * 
	 * @param Long pressure
	 */
	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	/**
	 * M�todo de obtenci�n de la propiedad humidity
	 * 
	 * @return Long humidity
	 */
	public Long getHumidity() {
		return humidity;
	}

	/**
	 * M�todo de establecimiento para la propiedad humidity
	 * 
	 * @param Long humidity
	 */
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}

	/**
	 * M�todo de obtenci�n de la propiedad seaLevel
	 * 
	 * @return Long seaLevel
	 */
	public Long getSeaLevel() {
		return seaLevel;
	}

	/**
	 * M�todo de establecimiento para la propiedad seaLevel
	 * 
	 * @param Long seaLevel
	 */
	public void setSeaLevel(Long seaLevel) {
		this.seaLevel = seaLevel;
	}

	/**
	 * M�todo de obtenci�n de la propiedad grndLevel
	 * 
	 * @return Long grndLevel
	 */
	public Long getGrndLevel() {
		return grndLevel;
	}

	/**
	 * M�todo de establecimiento para la propiedad grndLevel
	 * 
	 * @param Long grndLevel
	 */
	public void setGrndLevel(Long grndLevel) {
		this.grndLevel = grndLevel;
	}

	/**
	 * M�todo de obtenci�n de la propiedad weatherCurrency
	 * 
	 * @return WeatherCurrency weatherCurrency
	 */
	public WeatherCurrency getWeatherCurrency() {
		return weatherCurrency;
	}

	/**
	 * M�todo de establecimiento para la propiedad weatherCurrency
	 * 
	 * @param WeatherCurrency weatherCurrency
	 */
	public void setWeatherCurrency(WeatherCurrency weatherCurrency) {
		this.weatherCurrency = weatherCurrency;
	}
}