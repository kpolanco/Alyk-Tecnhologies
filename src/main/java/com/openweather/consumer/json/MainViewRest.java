/**
 * @(#) MainViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase MainViewRest.java
 * Description: Clase para ser utilizada como transportadora de informaci�n 
 * 				relacionada a la temperatura, presi�n atmosf�rica, humedad 
 * 				y nivel del mar.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase de transporte de informacion entre las capas de servicios y frontend.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.json
 */
@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MainViewRest implements Serializable {

	// Fields
	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("feels_like")
	private Double feelsLike;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;
	@JsonProperty("pressure")
	private Long pressure;
	@JsonProperty("humidity")
	private Long humidity;
	@JsonProperty("sea_level")
	private Long seaLevel;
	@JsonProperty("grnd_level")
	private Long grndLevel;

	// Property accessors
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
	public void setTemp(final Double temp) {
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
	public void setFeelsLike(final Double feelsLike) {
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
	public void setTempMin(final Double tempMin) {
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
	public void setTempMax(final Double tempMax) {
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
	public void setPressure(final Long pressure) {
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
	public void setHumidity(final Long humidity) {
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
	public void setSeaLevel(final Long seaLevel) {
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
	public void setGrndLevel(final Long grndLevel) {
		this.grndLevel = grndLevel;
	}
}