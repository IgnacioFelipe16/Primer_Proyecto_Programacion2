# Primer_Proyecto_Programacion2
Proyecto 1 de Programación 2.

Creación de base de datos y tablas del proyecto:

CREATE DATABASE `ejemplo`;
USE DATABASE `ejemplo`;

CREATE TABLE `ejemplo`.`cliente` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NULL DEFAULT NULL,
  `apellido` varchar(50) NULL DEFAULT NULL,
  `email` varchar(255) NULL DEFAULT NULL,
  `teléfono` varchar(50) NULL DEFAULT NULL,
  `password` varchar(50) NULL DEFAULT NULL,
  `dni` int(50) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB;

CREATE TABLE `ejemplo`.`usuario` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NULL DEFAULT NULL,
  `apellido` varchar(50) NULL DEFAULT NULL,
  `email` varchar(255) NULL DEFAULT NULL,
  `teléfono` varchar(50) NULL DEFAULT NULL,
  `password` varchar(50) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB;
