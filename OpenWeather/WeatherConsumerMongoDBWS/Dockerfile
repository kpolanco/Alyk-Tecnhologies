FROM openjdk:17-alpine
COPY "./build/libs/WeatherConsumerMongoDBWS-0.0.1-SNAPSHOT.jar" "WeatherConsumerMongoDBWS-v0.0.1.jar"
ARG weather_db_name
ARG weather_api_url
ARG weather_app_id
ARG weather_db_password
ARG weather_db_host
ARG weather_db_port
ARG weather_db_username
ARG weather_ws_server
ENV WEATHER_DB_NAME=$weather_db_name
ENV WEATHER_API_URL=$weather_api_url
ENV WEATHER_APP_ID=$weather_app_id
ENV WEATHER_DB_PASSWORD=$weather_db_password
ENV WEATHER_DB_HOST=$weather_db_host
ENV WEATHER_DB_PORT=$weather_db_port
ENV WEATHER_DB_USERNAME=$weather_db_username
ENV WEATHER_WS_SERVER=$weather_ws_server
EXPOSE 7080
ENTRYPOINT [ "java", "-jar", "WeatherConsumerMongoDBWS-v0.0.1.jar" ]