----------------------------------------------------------------------------------
--------------------------------- SCHEMA WEATHER ---------------------------------
----------------------------------------------------------------------------------
DROP DATABASE weather;
CREATE DATABASE weather;

----------------------------------------------------------------------------------
---------------------------------- USER WEATHER ----------------------------------
----------------------------------------------------------------------------------
CREATE USER 'weather'@'localhost' IDENTIFIED BY 'Weather2022';
GRANT ALL PRIVILEGES ON weather.* TO 'weather'@'localhost';

----------------------------------------------------------------------------------
------------------------------- TABLAS DE WEATHER --------------------------------
----------------------------------------------------------------------------------
USE weather;

CREATE TABLE `weather`.`SYS` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `TYPE` INTEGER NOT NULL DEFAULT 0,
  `COUNTRY` VARCHAR(60) NOT NULL DEFAULT '',
  `SUNRISE` INTEGER NOT NULL DEFAULT 0,
  `SUNSET` INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`MAIN` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `TEMP` DOUBLE NOT NULL DEFAULT 0,
  `FEELS_LIKE` DOUBLE NOT NULL DEFAULT 0,
  `TEMP_MIN` DOUBLE NOT NULL DEFAULT 0,
  `TEMP_MAX` DOUBLE NOT NULL DEFAULT 0,
  `PRESSURE` INTEGER NOT NULL DEFAULT 0,
  `HUMIDITY` INTEGER NOT NULL DEFAULT 0,
  `SEA_LEVEL` INTEGER DEFAULT 0,
  `GRND_LEVEL` INTEGER DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`COORD` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `LON` DOUBLE NOT NULL DEFAULT 0,
  `LAT` DOUBLE NOT NULL DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`CLOUDS` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `ALL_CLOUDS` INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`WIND` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `SPEED` DOUBLE NOT NULL DEFAULT 0,
  `DEG` INTEGER NOT NULL DEFAULT 0,
  `GUST` DOUBLE DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`WEATHER` (
  `ID` INTEGER NOT NULL AUTO_INCREMENT,
  `MAIN` VARCHAR(60) NOT NULL DEFAULT '',
  `DESCRIPTION` VARCHAR(150) NOT NULL DEFAULT '',
  `ICON` VARCHAR(5) NOT NULL DEFAULT '',
  `WEATHER_ID` INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

CREATE TABLE `weather`.`WEATHER_CURRENCY` (
  `ID` INTEGER NOT NULL DEFAULT 0,
  `NAME` VARCHAR(60) NOT NULL DEFAULT '',
  `COD` INTEGER NOT NULL DEFAULT 0,
  `BASE` VARCHAR(60) NOT NULL DEFAULT '',
  `VISIBILITY` INTEGER NOT NULL DEFAULT 0,
  `DT` INTEGER NOT NULL DEFAULT 0,
  `TIMEZONE` INTEGER NOT NULL DEFAULT 0,
  `FECHA_REGISTRO` timestamp NOT NULL,
  `WIND_ID` INTEGER NOT NULL DEFAULT 0,
  `CLOUDS_ID` INTEGER NOT NULL DEFAULT 0,
  `SYS_ID` INTEGER NOT NULL DEFAULT 0,
  `COORD_ID` INTEGER NOT NULL DEFAULT 0,
  `MAIN_ID` INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY(`ID`)
)
ENGINE = InnoDB;

----------------------------------------------------------------------------------
------------------------------- FOREIGN KEY PANINIS ------------------------------
----------------------------------------------------------------------------------
ALTER TABLE `weather`.`WEATHER` ADD CONSTRAINT `FK_weather_1` FOREIGN KEY `FK_weather_1` (`WEATHER_ID`)
    REFERENCES `WEATHER_CURRENCY` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `weather`.`WEATHER_CURRENCY` ADD CONSTRAINT `FK_weather_currency_1` FOREIGN KEY `FK_weather_currency_1` (`CLOUDS_ID`)
    REFERENCES `CLOUDS` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `weather`.`WEATHER_CURRENCY` ADD CONSTRAINT `FK_weather_currency_2` FOREIGN KEY `FK_weather_currency_2` (`WIND_ID`)
    REFERENCES `WIND` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `weather`.`WEATHER_CURRENCY` ADD CONSTRAINT `FK_weather_currency_3` FOREIGN KEY `FK_weather_currency_3` (`SYS_ID`)
    REFERENCES `SYS` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `weather`.`WEATHER_CURRENCY` ADD CONSTRAINT `FK_weather_currency_4` FOREIGN KEY `FK_weather_currency_4` (`COORD_ID`)
    REFERENCES `COORD` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;

ALTER TABLE `weather`.`WEATHER_CURRENCY` ADD CONSTRAINT `FK_weather_currency_5` FOREIGN KEY `FK_weather_currency_5` (`MAIN_ID`)
    REFERENCES `MAIN` (`ID`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;