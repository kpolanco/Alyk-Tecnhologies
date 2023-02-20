/**
 * @(#) WeatherCurrencyViewRest.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherCurrencyViewRest.java
 * Description: Clase para ser utilizada como transportadora de información 
 * 				relacionada a la respuesta del servicio que obtiene el estado del clima.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.json;

import java.io.Serializable;
import java.util.List;

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
public class WeatherCurrencyViewRest implements Serializable {

	// Fields
	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private Long cod;
	@JsonProperty("base")
	private String base;
	@JsonProperty("visibility")
	private Long visibility;
	@JsonProperty("dt")
	private Long dt;
	@JsonProperty("timezone")
	private Long timezone;
	@JsonProperty("wind")
	private WindViewRest wind;
	@JsonProperty("clouds")
	private CloudsViewRest clouds;
	@JsonProperty("sys")
	private SysViewRest sys;
	@JsonProperty("coord")
	private CoordViewRest coord;
	@JsonProperty("main")
	private MainViewRest main;
	@JsonProperty("weather")
	private List<WeatherViewRest> weathers;

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
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Método de obtención de la propiedad name
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método de establecimiento para la propiedad name
	 * 
	 * @param String name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Método de obtención de la propiedad cod
	 * 
	 * @return Long cod
	 */
	public Long getCod() {
		return cod;
	}

	/**
	 * Método de establecimiento para la propiedad cod
	 * 
	 * @param Long cod
	 */
	public void setCod(final Long cod) {
		this.cod = cod;
	}

	/**
	 * Método de obtención de la propiedad base
	 * 
	 * @return String base
	 */
	public String getBase() {
		return base;
	}

	/**
	 * Método de establecimiento para la propiedad base
	 * 
	 * @param String base
	 */
	public void setBase(final String base) {
		this.base = base;
	}

	/**
	 * Método de obtención de la propiedad visibility
	 * 
	 * @return Long visibility
	 */
	public Long getVisibility() {
		return visibility;
	}

	/**
	 * Método de establecimiento para la propiedad visibility
	 * 
	 * @param Long visibility
	 */
	public void setVisibility(final Long visibility) {
		this.visibility = visibility;
	}

	/**
	 * Método de obtención de la propiedad dt
	 * 
	 * @return Long dt
	 */
	public Long getDt() {
		return dt;
	}

	/**
	 * Método de establecimiento para la propiedad dt
	 * 
	 * @param Long dt
	 */
	public void setDt(final Long dt) {
		this.dt = dt;
	}

	/**
	 * Método de obtención de la propiedad timezone
	 * 
	 * @return Long timezone
	 */
	public Long getTimezone() {
		return timezone;
	}

	/**
	 * Método de establecimiento para la propiedad timezone
	 * 
	 * @param Long timezone
	 */
	public void setTimezone(final Long timezone) {
		this.timezone = timezone;
	}

	/**
	 * Método de obtención de la propiedad wind
	 * 
	 * @return WindViewRest wind
	 */
	public WindViewRest getWind() {
		return wind;
	}

	/**
	 * Método de establecimiento para la propiedad wind
	 * 
	 * @param WindViewRest wind
	 */
	public void setWind(final WindViewRest wind) {
		this.wind = wind;
	}

	/**
	 * Método de obtención de la propiedad clouds
	 * 
	 * @return CloudsViewRest clouds
	 */
	public CloudsViewRest getClouds() {
		return clouds;
	}

	/**
	 * Método de establecimiento para la propiedad clouds
	 * 
	 * @param CloudsViewRest clouds
	 */
	public void setClouds(final CloudsViewRest clouds) {
		this.clouds = clouds;
	}

	/**
	 * Método de obtención de la propiedad sys
	 * 
	 * @return SysViewRest sys
	 */
	public SysViewRest getSys() {
		return sys;
	}

	/**
	 * Método de establecimiento para la propiedad sys
	 * 
	 * @param SysViewRest sys
	 */
	public void setSys(final SysViewRest sys) {
		this.sys = sys;
	}

	/**
	 * Método de obtención de la propiedad coord
	 * 
	 * @return CoordViewRest coord
	 */
	public CoordViewRest getCoord() {
		return coord;
	}

	/**
	 * Método de establecimiento para la propiedad coord
	 * 
	 * @param CoordViewRest coord
	 */
	public void setCoord(final CoordViewRest coord) {
		this.coord = coord;
	}

	/**
	 * Método de obtención de la propiedad main
	 * 
	 * @return MainViewRest main
	 */
	public MainViewRest getMain() {
		return main;
	}

	/**
	 * Método de establecimiento para la propiedad main
	 * 
	 * @param MainViewRest main
	 */
	public void setMain(final MainViewRest main) {
		this.main = main;
	}

	/**
	 * Método de obtención de la propiedad weathers
	 * 
	 * @return List<WeatherViewRest> weathers
	 */
	public List<WeatherViewRest> getWeathers() {
		return weathers;
	}

	/**
	 * Método de establecimiento para la propiedad weathers
	 * 
	 * @param List<WeatherViewRest> weathers
	 */
	public void setWeathers(final List<WeatherViewRest> weathers) {
		this.weathers = weathers;
	}
}