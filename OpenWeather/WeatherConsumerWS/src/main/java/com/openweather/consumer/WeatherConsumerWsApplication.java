package com.openweather.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Open Weather Consumer Docs", version = "1.0", 
	description = "This page specifies the services, requests, parameters and possible responses that are required for the integration between the Weather Consumer project and Open Weather API."))
public class WeatherConsumerWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherConsumerWsApplication.class, args);
	}
}