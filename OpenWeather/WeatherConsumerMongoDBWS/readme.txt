**********************************************************
 Paquete de Instalación de los siguientes requerimientos:
**********************************************************
Desarrollar microservicio que exponga un API con dos rutas:
1.) Una de las rutas debe permitir consultar el clima de una ciudad, cuyo nombre debe de ir en el cuerpo de la petición. La información que se regresa es la que proporciona por el API de OpenWeather y el resultado deberá ser almacenado en el microservicio. SI el API de OpenWeather se encuentra abajo deberá regresar el último estatus consultado, si no se ha consultado deberá regresar alguna respuesta válida (se deja a consideración que el desarrollador proponga la respuesta).
2.) La segunda ruta deberá regresar un objeto que contenga un resumen histórico de las consultas que se han hecho a las últimas 10 ciudades.

*********************************
 Requisitos para la ambientación
*********************************
Interfaz de Contenedor: Docker Desktop 4.16.2
Java: JDK 17
Gestor de BD: MongoDB 6.0
IDE: Spring Tool Suite 4-4.9.0 o versión más actual
Manejador de Dependencias: Gradle 7.6

*****************************************
 Se deben realizar los siguientes pasos:
*****************************************
1.) Descargar el código del siguiente proyecto a través del Git Bash, utiliando el siguiente comando [git clone https://github.com/kpolanco/Alyk-Tecnhologies.git]
2.) Si la estructura de despliegue del proyecto es a través de docker, se debe bajar la imagen oficial de MongoDB para esto se debe colocar el siguiente comando en una terminal de windows [CMD]: docker pull mongo:6.0.4
3.) Una vez creada la imagen del MongoDB, se debe crear un contenedor con las siguientes especificaciones:
	A.) El contenedor se definirá como [mongo-db-dev]
	B.) Se crea un usuario dba con acceso a base de datos llamado: [mongodba]
	C.) Se establece el password del usuario [mongodba] con el siguiente valor: [Admin2022]
	D.) Se define como puerto por defecto de este contenedor: 27117
	F.) Para generar un contenedor con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en una terminal de windows [CMD]:
		docker run --name mongo-db-dev -e MONGO_INITDB_ROOT_USERNAME=mongodba -e MONGO_INITDB_ROOT_PASSWORD=Admin2022 -p 27117:27017 -d mongo:6.0.4
4.) Para desplegar el contenedor [mongo-db-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker start mongo-db-dev
5.) Instalamos en nuestro equipo la herramienta [MongoDB Shell], que nos permite acceder a la BD previamente desplegada en Docker
6.) Colocar el siguiente comando en una terminal de windows [CMD]: mongosh --port 27117 -u "mongodba" -p "Admin2022" --authenticationDatabase "admin"
7.) Se crea un esquema de base de datos llamado [weather], ejecutando el siguiente comando en terminal de windows [CMD]: use weather
8.) Se crea una colección llamada [weather_currency], ejecutando el siguiente comando en terminal de windows [CMD]: db.weather_currency.insert({name: "Caracas"})
9.) Se crea un usuario de acceso a base de datos llamado [weather] y se establece como password el valor [Weather2022], ejecutando el siguiente comando en terminal de windows [CMD]: 
	db.createUser({
		user: "weather",
		pwd: "Weather2022",
		roles: [ { role: "readWrite", db: "weather" } ]
	})
10.) En otra terminal de windows [CMD], nos ubicaremos en la raiz del proyecto [WeatherConsumerMongoDBWS] a través del siguiente comando: cd \OpenWeather\WeatherConsumerMongoDBWS
11.) En este punto estaremos construyendo una imagen para el despliegue del servicio [WeatherConsumerMongoDBWS], donde se establecerán las siguientes especificaciones:
	A.) La imagen se definirá como [weather-consumer-mongodb-docker]
	B.) Se agregará el argumento [weather_db_name], que contiene el esquema de base de datos manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: weather
	C.) Se agregará el argumento [weather_db_username], que contiene el usuario de base de datos manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: weather
	D.) Se agregará el argumento [weather_db_password], que contiene el password de base de datos manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: Weather2022
	E.) Se agregará el argumento [weather_db_host], que contiene el hostname de base de datos manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: 172.17.0.1
	F.) Se agregará el argumento [weather_db_port], que contiene el puerto de base de datos manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: 27117
	G.) Se agregará el argumento [weather_api_url], que contiene el endpoint del API OpenWeather manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}
	H.) Se agregará el argumento [weather_app_id], que contiene el key del API OpenWeather manejado para el proyecto [WeatherConsumerMongoDBWS] y su valor es: 4e7e56f081837de93c78981b0133fc69
	I.) Se agregará el argumento [weather_ws_server], que contiene el hostname y puerto manejado en el proyecto [WeatherConsumerMongoDBWS] y su valor es: http://localhost:7085
	J.) Para generar una imagen con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en la terminal de windows [CMD]:
		docker build -t "weather-consumer-mongodb-docker" . --build-arg weather_db_name="weather" --build-arg weather_api_url="https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}" --build-arg weather_app_id="4e7e56f081837de93c78981b0133fc69" --build-arg weather_db_password="Weather2022" --build-arg weather_db_host="172.17.0.1" --build-arg weather_db_port="27117"  --build-arg weather_db_username="weather" --build-arg weather_ws_server="http://172.17.0.1:7085"
12.) Una vez creada la imagen [weather-consumer-mongodb-docker], se debe crear un contenedor con las siguientes especificaciones:
	A.) El contenedor se definirá como [weather-consumer-mongodb-dev]
	B.) Se define como puerto por defecto de este contenedor: 7080
	C.) Se creará un enlace con el contenedor [mongo-db-dev]
	D.) Para generar un contenedor con todas las especificaciones descritas anteriormente, se debe colocar el siguiente comando en una terminal de windows [CMD]:
		docker run --name weather-consumer-mongodb-dev -p 7080:7080 --link mongo-db-dev:mongo weather-consumer-mongodb-docker:latest
13.) Para obtener el estado de nuestro contenedores, debemos escribir el siguiente comando en una terminal de windows [CMD]: docker ps -a
14.) Si el contenedor [mongo-db-dev] tiene el estado [Exited], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker start mongo-db-dev
15.) Para abrir la terminal del contenedor [mongo-db-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker exec -it mongo-db-dev bash -l
16.) Si el contenedor [weather-consumer-dev] tiene el estado [Exited], se debe colocar el siguiente comando en otra terminal de windows [CMD]: docker start weather-consumer-dev
17.) Para abrir la terminal del contenedor [weather-consumer-mongodb-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker exec -it weather-consumer-mongodb-dev bash -l
18.) Una vez levantado el servicio, pueden acceder a la documentación por medio de Swagger con el siguiente URL: http://localhost:7080/weather-consumer-mongodb-service/swagger-ui.html
19.) También se puede realizar pruebas en PostMan, importando el archivo [Open Weather API - Mongo DB.postman_collection.json] ubicado en la ruta [\Prueba Finvivir\Documentos] que contiene la definición de los desarrollados en el microservicio [WeatherConsumerMongoDBWS]
20.) Si requiere bajar el contenedor [mongo-db-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker stop mongo-db-dev
21.) Si requiere bajar el contenedor [weather-consumer-mongodb-dev], se debe colocar el siguiente comando en una terminal de windows [CMD]: docker stop weather-consumer-mongodb-dev