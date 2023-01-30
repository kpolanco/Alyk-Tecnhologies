/**
 * @(#) WeatherCurrency.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase WeatherCurrency.java
 * Description: Entidad Relacional de la Tabla [WEATHER_CURRENCY]
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Entidad Relacional de la Tabla [WEATHER_CURRENCY]
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.entity
 */
@SuppressWarnings("serial")
@Entity
@Table(schema = "weather", name = "WEATHER_CURRENCY")
public class WeatherCurrency implements Serializable {

	// Fields
	@Id
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	private Long id;
	@Column(name = "NAME", nullable = false, length = 60)
	private String name;
	@Column(name = "COD", nullable = false)
	private Long cod;
	@Column(name = "BASE", nullable = false, length = 60)
	private String base;
	@Column(name = "VISIBILITY", nullable = false)
	private Long visibility;
	@Column(name = "DT", nullable = false)
	private Long dt;
	@Column(name = "TIMEZONE", nullable = false)
	private Long timezone;
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WIND_ID", referencedColumnName = "ID")
	private Wind wind;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLOUDS_ID", referencedColumnName = "ID")
	private Clouds clouds;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SYS_ID", referencedColumnName = "ID")
	private Sys sys;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "COORD_ID", referencedColumnName = "ID")
	private Coord coord;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAIN_ID", referencedColumnName = "ID")
	private Main main;
	@OneToMany(mappedBy = "weatherCurrency", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Weather> weathers;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public WeatherCurrency() {
		this.weathers = new ArrayList<>();
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
	public void setName(String name) {
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
	public void setCod(Long cod) {
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
	public void setBase(String base) {
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
	public void setVisibility(Long visibility) {
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
	public void setDt(Long dt) {
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
	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	/**
	 * Método de obtención de la propiedad fechaRegistro
	 * 
	 * @return Date fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * Método de establecimiento para la propiedad fechaRegistro
	 * 
	 * @param Date fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * Método de obtención de la propiedad wind
	 * 
	 * @return Wind wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 * Método de establecimiento para la propiedad wind
	 * 
	 * @param Wind wind
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/**
	 * Método de obtención de la propiedad clouds
	 * 
	 * @return Clouds clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/**
	 * Método de establecimiento para la propiedad clouds
	 * 
	 * @param Clouds clouds
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/**
	 * Método de obtención de la propiedad sys
	 * 
	 * @return Sys sys
	 */
	public Sys getSys() {
		return sys;
	}

	/**
	 * Método de establecimiento para la propiedad sys
	 * 
	 * @param Sys sys
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	/**
	 * Método de obtención de la propiedad coord
	 * 
	 * @return Coord coord
	 */
	public Coord getCoord() {
		return coord;
	}

	/**
	 * Método de establecimiento para la propiedad coord
	 * 
	 * @param Coord coord
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	/**
	 * Método de obtención de la propiedad main
	 * 
	 * @return Main main
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * Método de establecimiento para la propiedad main
	 * 
	 * @param Main main
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/**
	 * Método de obtención de la propiedad weathers
	 * 
	 * @return List<Weather> weathers
	 */
	public List<Weather> getWeathers() {
		return weathers;
	}

	/**
	 * Método de establecimiento para la propiedad weathers
	 * 
	 * @param List<Weather> weathers
	 */
	public void setWeathers(List<Weather> weathers) {
		this.weathers = weathers;
	}
}