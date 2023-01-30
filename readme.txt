**********************************************************
 Paquete de Instalación de los siguientes requerimientos:
**********************************************************
Desarrollar microservicio que exponga un API con dos rutas:
1.) Una de las rutas debe permitir consultar el clima de una ciudad, cuyo nombre debe de ir en el cuerpo de la petición. La información que se regresa es la que proporciona por el API de OpenWeather y el resultado deberá ser almacenado en el microservicio. SI el API de OpenWeather se encuentra abajo deberá regresar el último estatus consultado, si no se ha consultado deberá regresar alguna respuesta válida (se deja a consideración que el desarrollador proponga la respuesta).
2.) La segunda ruta deberá regresar un objeto que contenga un resumen histórico de las consultas que se han hecho a las últimas 10 ciudades.

*********************************
 Requisitos para la ambientación
*********************************
Contenedor: Docker Desktop 4.16.2
Java: JDK 17
Gestor de BD: MySQL 5.7 o superior
IDE: Spring Tool Suite 4-4.9.0 o versión más actual
Manejador de Dependencias: Gradle 7.6

*****************************************
 Se deben realizar los siguientes pasos:
*****************************************
1.) Se debe ejecutar el script [Scripts Weather.sql] ubicado en la ruta [\Prueba Finvivir\Documentos]

2.) Crear las siguientes variables de entorno, dentro del contenedor donde se estará desplegando el app
SET WEATHER_API_URL=https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}
SET WEATHER_APP_ID=4e7e56f081837de93c78981b0133fc69
SET WEATHER_DB_NAME=weather
SET WEATHER_DB_PASSWORD=Weather2022
SET WEATHER_DB_SERVER=localhost:3306
SET WEATHER_DB_USERNAME=weather
SET WEATHER_WS_SERVER=http://localhost:7085

3.) Importar el archivo [WeatherConsumerWS-0.0.1-SNAPSHOT.jar] ubicado en la ruta [\Prueba Finvivir\Compilado].

4.) Ejecutar el siguiente comando en el terminal CMD [java -jar WeatherConsumerWS-0.0.1-SNAPSHOT.jar]

5.) Una vez levantado el servicio, pueden acceder a la documentación de Swagger con el siguiente URL: http://localhost:7090/weather-consumer-service/swagger-ui.html
 
6.) Se pueden realizar pruebas en PostMan, importar el archivo [Open Weather API.postman_collection.json] ubicado en la ruta [\Prueba Finvivir\Documentos] que contiene la definición de los desarrollados en el microservicio [WeatherConsumerWS]