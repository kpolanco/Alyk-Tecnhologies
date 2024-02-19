/**
 * @(#) WeatherDao.java
 *
 * Project: WeatherConsumerWS
 * Title: Interfaz WeatherDao.java
 * Description: Interfaz que proporciona persistencia de la entidad WeatherCurrency
 * Copyright: Copyright(c) 30/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.openweather.consumer.entity.WeatherCurrency;

/**
 * Objeto de Acceso a Datos que proporciona persistencia y soporte de busqueda
 * de la entidad WeatherCurrency
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.dao
 */
@Repository("weatherDao")
public interface WeatherDao extends JpaRepository<WeatherCurrency, Long> {

	/**
	 * Método que busca los datos meteorológicos de una ciudad dado el nombre de la
	 * ciudad en BD.
	 * 
	 * @param cityName
	 * @return Optional<WeatherCurrency>
	 */
	@Query("SELECT model FROM WeatherCurrency model WHERE model.name = :cityName")
	Optional<WeatherCurrency> findByCityName(@Param("cityName") final String cityName);
	
	/**
	 * Método que obtiene el listado de los 10 últimos registros realizados en BD.
	 * 
	 * @return List<WeatherCurrency>
	 */
	@Query("SELECT model FROM WeatherCurrency model ORDER BY model.fechaRegistro DESC LIMIT 10")
	List<WeatherCurrency> findLastTenRecords();
}