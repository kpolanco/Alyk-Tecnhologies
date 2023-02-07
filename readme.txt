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
1.) Descargar el código del siguiente proyecto a través del Git Bash, utiliando el siguiente comando [git clone https://github.com/kpolanco/Alyk-Tecnhologies.git]
2.) Si la estructura de despliegue del proyecto es a través de docker, se debe bajar la imagen oficial de MySQL para esto se debe colocar el siguiente comando en una terminal de windows [CMD]: docker pull mysql
3.) Una vez creada la imagen del MySQL, se debe crear un contenedor con las siguientes especificaciones:
	A.) El contenedor se definirá como [my-sql-dev]
	B.) Se establece el password del usuario [root] con el siguiente valor: [Admin2022]
	C.) Se crea un esquema de base de datos llamado: [weather]
	D.) Se crea un usuario de acceso a base de datos llamado: [weather]
	E.) Se establece el password del usuario [weather] con el siguiente valor: [Weather2022]
	F.) Se define como puerto por defecto de este contenedor: 3306
	G.) Para generar un contenedor con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en una terminal de windows [CMD]:
		docker run --name my-sql-dev -e MYSQL_ROOT_PASSWORD=Admin2022 -e MYSQL_DATABASE=weather -e MYSQL_USER=weather -e MYSQL_PASSWORD=Weather2022 -p 3306:3306 -d mysql:8.0.32
4.) Para desplegar el contenedor [my-sql-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker start my-sql-dev
5.) Para abrir la terminal del contenedor [my-sql-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker exec -it my-sql-dev bash -l
6.) Una vez en la terminal del contenedor [my-sql-dev] se debe ejecutar el siguiente comando: mysql -u weather -p
7.) Se deberá agregar el password del usuario [weather], definido en el punto [3-E]. Una vez dentro del MySQL Line Command se deberá ejecutar el contenido script [Scripts Weather (Tables).sql], ubicado en la ruta [\Prueba Finvivir\Documentos]
8.) En otra terminal de windows [CMD], nos ubicaremos en la raiz del proyecto [WeatherConsumerWS] a través del siguiente comando: cd \OpenWeather\WeatherConsumerWS
9.) En este punto estaremos construyendo una imagen para el despliegue del servicio [WeatherConsumerWS], donde se establecerán las siguientes especificaciones:
	A.) La imagen se definirá como [weather-consumer-docker]
	B.) Se agregará el argumento [weather_db_name], que contiene el esquema de base de datos manejado en el proyecto [WeatherConsumerWS] y su valor es: weather
	C.) Se agregará el argumento [weather_db_username], que contiene el usuario de base de datos manejado en el proyecto [WeatherConsumerWS] y su valor es: weather
	D.) Se agregará el argumento [weather_db_password], que contiene el password de base de datos manejado en el proyecto [WeatherConsumerWS] y su valor es: Weather2022
	E.) Se agregará el argumento [weather_db_server], que contiene el hostname y puerto de base de datos manejado en el proyecto [WeatherConsumerWS] y su valor es: localhost:3306
	F.) Se agregará el argumento [weather_api_url], que contiene el endpoint del API OpenWeather manejado en el proyecto [WeatherConsumerWS] y su valor es: https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}
	G.) Se agregará el argumento [weather_app_id], que contiene el key del API OpenWeather manejado para el proyecto [WeatherConsumerWS] y su valor es: 4e7e56f081837de93c78981b0133fc69
	H.) Se agregará el argumento [weather_ws_server], que contiene el hostname y puerto manejado en el proyecto [WeatherConsumerWS] y su valor es: http://localhost:7085
	I.) Para generar una imagen con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en la terminal de windows [CMD]:
		docker build -t "weather-consumer-docker" . --build-arg weather_db_name="weather" --build-arg weather_api_url="https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}" --build-arg weather_app_id="4e7e56f081837de93c78981b0133fc69" --build-arg weather_db_password="Weather2022" --build-arg weather_db_server="172.17.0.1:3306" --build-arg weather_db_username="weather" --build-arg weather_ws_server="http://172.17.0.1:7085"
10.) Una vez creada la imagen [weather-consumer-docker], se debe crear un contenedor con las siguientes especificaciones:
	A.) El contenedor se definirá como [weather-consumer-dev]
	B.) Se define como puerto por defecto de este contenedor: 7090
	C.) Se creará un enlace con el contenedor [my-sql-dev]
	D.) Para generar un contenedor con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en una terminal de windows [CMD]:
		docker run --name weather-consumer-dev -p 7090:7090 --link my-sql-dev:mysql weather-consumer-docker:latest
11.) Para obtener el estado de nuestro contenedores, debemos escribir el siguiente comando en una terminal de windows [CMD]: docker ps -a
12.) Si el contenedor [my-sql-dev] tiene el estado [Exited], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker start my-sql-dev
13.) Para abrir la terminal del contenedor [my-sql-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker exec -it my-sql-dev bash -l
14.) Si el contenedor [weather-consumer-dev] tiene el estado [Exited], se debe colocar el siguiente comando en otra terminal de windows [CMD]: docker start weather-consumer-dev
15.) Para abrir la terminal del contenedor [weather-consumer-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker exec -it weather-consumer-dev bash -l
16.) Una vez levantado el servicio, pueden acceder a la documentación por medio de Swagger con el siguiente URL: http://localhost:7090/weather-consumer-service/swagger-ui.html
17.) También se puede realizar pruebas en PostMan, importando el archivo [Open Weather API.postman_collection.json] ubicado en la ruta [\Prueba Finvivir\Documentos] que contiene la definición de los desarrollados en el microservicio [WeatherConsumerWS]
18.) Si requiere bajar el contenedor [my-sql-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker stop my-sql-dev
19.) Si requiere bajar el contenedor [weather-consumer-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker stop weather-consumer-dev