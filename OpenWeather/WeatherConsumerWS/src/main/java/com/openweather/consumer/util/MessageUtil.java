/**
 * @(#) MessageUtil.java
 *
 * Project: WeatherConsumerWS
 * Title: Clase MessageUtil.java
 * Description: Utilitario que manipula el archivo de propiedades [messages.properties].
 * Copyright: Copyright(c) 29/01/2023
 * Company: Grupo FI
 * @author: Kelly Polanco
 * @version 1.0
 */
package com.openweather.consumer.util;

import java.text.MessageFormat;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Clase utilitaria que manipula el archivo de propiedades
 * [messages.properties], el cual permite leer un valor de este archivo.
 *
 * @author Kelly Polanco
 * @package com.openweather.consumer.util
 */
@Configuration
@PropertySource("classpath:messages.properties")
@ConfigurationProperties(prefix = "message")
public class MessageUtil {

	// Fields
	private String successOperation;
	private String objectDoesNotExists;
	private String objectDoesNotExistsNothing;
	private String listDoesNotExists;
	private String duplicateObject;
	private String failureSaveObject;
	private String failureUpdateObject;
	private String unexpectedException;

	// Constructors
	/**
	 * Constructor por Defecto
	 */
	public MessageUtil() {
	}

	// Property accessors
	/**
	 * Método de obtención de la propiedad successOperation
	 * 
	 * @return String successOperation
	 */
	public String getSuccessOperation() {
		return successOperation;
	}

	/**
	 * Método de establecimiento para la propiedad successOperation
	 * 
	 * @param String successOperation
	 */
	public void setSuccessOperation(final String successOperation) {
		this.successOperation = successOperation;
	}

	/**
	 * Método de obtención de la propiedad objectDoesNotExists
	 * 
	 * @param functionality
	 * @param fields
	 * @return String objectDoesNotExists
	 */
	public String getObjectDoesNotExists(final String functionality, final String fields) {
		return MessageFormat.format(this.objectDoesNotExists, functionality, fields);
	}

	/**
	 * Método de establecimiento para la propiedad objectDoesNotExists
	 * 
	 * @param String objectDoesNotExists
	 */
	public void setObjectDoesNotExists(final String objectDoesNotExists) {
		this.objectDoesNotExists = objectDoesNotExists;
	}

	/**
	 * Método de obtención de la propiedad listDoesNotExists
	 * 
	 * @return String listDoesNotExists
	 */
	public String getListDoesNotExists() {
		return listDoesNotExists;
	}

	/**
	 * Método de establecimiento para la propiedad listDoesNotExists
	 * 
	 * @param String listDoesNotExists
	 */
	public void setListDoesNotExists(final String listDoesNotExists) {
		this.listDoesNotExists = listDoesNotExists;
	}

	/**
	 * Método de obtención de la propiedad objectDoesNotExistsNothing
	 * 
	 * @param fields
	 * @return String objectDoesNotExistsNothing
	 */
	public String getObjectDoesNotExistsNothing(final String fields) {
		return MessageFormat.format(this.objectDoesNotExistsNothing, fields);
	}

	/**
	 * Método de establecimiento para la propiedad objectDoesNotExistsNothing
	 * 
	 * @param String objectDoesNotExistsNothing
	 */
	public void setObjectDoesNotExistsNothing(String objectDoesNotExistsNothing) {
		this.objectDoesNotExistsNothing = objectDoesNotExistsNothing;
	}

	/**
	 * Método de obtención de la propiedad duplicateObject
	 * 
	 * @param functionality
	 * @param fields
	 * @return String duplicateObject
	 */
	public String getDuplicateObject(final String functionality, final String fields) {
		return MessageFormat.format(this.duplicateObject, functionality, fields);
	}

	/**
	 * Método de establecimiento para la propiedad duplicateObject
	 * 
	 * @param String duplicateObject
	 */
	public void setDuplicateObject(final String duplicateObject) {
		this.duplicateObject = duplicateObject;
	}

	/**
	 * Método de obtención de la propiedad failureSaveObject
	 * 
	 * @param functionality
	 * @return String failureSaveObject
	 */
	public String getFailureSaveObject(final String functionality) {
		return MessageFormat.format(this.failureSaveObject, functionality);
	}

	/**
	 * Método de establecimiento para la propiedad failureSaveObject
	 * 
	 * @param String failureSaveObject
	 */
	public void setFailureSaveObject(final String failureSaveObject) {
		this.failureSaveObject = failureSaveObject;
	}

	/**
	 * Método de obtención de la propiedad failureUpdateObject
	 * 
	 * @param functionality
	 * @return String failureUpdateObject
	 */
	public String getFailureUpdateObject(final String functionality) {
		return MessageFormat.format(this.failureUpdateObject, functionality);
	}

	/**
	 * Método de establecimiento para la propiedad failureUpdateObject
	 * 
	 * @param String failureUpdateObject
	 */
	public void setFailureUpdateObject(final String failureUpdateObject) {
		this.failureUpdateObject = failureUpdateObject;
	}

	/**
	 * Método de obtención de la propiedad unexpectedException
	 * 
	 * @return String unexpectedException
	 */
	public String getUnexpectedException() {
		return unexpectedException;
	}

	/**
	 * Método de establecimiento para la propiedad unexpectedException
	 * 
	 * @param String unexpectedException
	 */
	public void setUnexpectedException(final String unexpectedException) {
		this.unexpectedException = unexpectedException;
	}
}