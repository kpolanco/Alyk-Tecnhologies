/**
 * @(#) ValidateField.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase ValidateField.java
 * Description: Clase que maneja las validaciones de los campos requeridos en los servicios.
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.util;

import java.util.Set;

import org.springframework.http.HttpStatus;

import com.openweather.consumer.response.WeatherResponse;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

/**
 * Clase que maneja las validaciones de los campos requeridos en los servicios.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.util
 */
public class ValidateField<T> {

	// Fields
	private Validator validator;
	private WeatherResponse<T> weatherResponse;

	// Constructors
	/**
	 * Constructor Mínimo
	 * 
	 * @param validator
	 */
	public ValidateField(final Validator validator) {
		this.validator = validator;
	}

	// Property accessors
	/**
	 * Método de obtención de la propiedad weatherResponse
	 * 
	 * @return WeatherResponse<?> weatherResponse
	 */
	public WeatherResponse<?> getWeatherResponse() {
		return weatherResponse;
	}

	/**
	 * Método que valida los campos de entrada (requerido/vacío/formato) de los
	 * servicios.
	 * 
	 * @param object
	 * @return Boolean
	 */
	public Boolean isValidateRequest(T object) {
		final Set<ConstraintViolation<T>> violations = this.validator.validate(object);
		if (!violations.isEmpty()) {
			final StringBuilder builder = new StringBuilder();
			for (final ConstraintViolation<?> violation : violations) {
				builder.append(violation.getMessage());
			}

			this.weatherResponse = new WeatherResponse<>(
				HttpStatus.BAD_REQUEST.value(), "Failure", builder.toString());
			return false;
		}

		this.weatherResponse = null;
		return true;
	}
}