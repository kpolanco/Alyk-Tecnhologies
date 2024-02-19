FROM openjdk:17-alpine
COPY "./build/libs/WeatherConsumerWS-0.0.1-SNAPSHOT.jar" "WeatherConsumerWS-v0.0.1.jar"
ARG weather_db_name
ARG weather_api_url
ARG weather_app_id
ARG weather_db_password
ARG weather_db_server
ARG weather_db_username
ARG weather_ws_server
ENV WEATHER_DB_NAME=$weather_db_name
ENV WEATHER_API_URL=$weather_api_url
ENV WEATHER_APP_ID=$weather_app_id
ENV WEATHER_DB_PASSWORD=$weather_db_password
ENV WEATHER_DB_SERVER=$weather_db_server
ENV WEATHER_DB_USERNAME=$weather_db_username
ENV WEATHER_WS_SERVER=$weather_ws_server
EXPOSE 7090
ENTRYPOINT [ "java", "-jar", "WeatherConsumerWS-v0.0.1.jar" ]