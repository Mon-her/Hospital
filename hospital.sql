-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2019 a las 03:02:07
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`nombre`, `apellido`, `id`) VALUES
('Mario', 'Cardenas', 123456789);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` int(10) NOT NULL,
  `tipo_cita` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`nombre`, `apellido`, `direccion`, `telefono`, `tipo_cita`) VALUES
('0', '0', '0', 0, 1),
('5', '5', '5', 5, NULL),
('7', '7', '7', 7, NULL),
('111', '11', '11', 11, NULL),
('14', '14', '14', 14, NULL),
('15', '15', '15', 15, NULL),
('17', '47', '1', 17, NULL),
('17', '17', '17', 18, NULL),
('20', '02', '20', 20, NULL),
('30', '30', '30', 30, NULL),
('31', '31', '31', 31, 1),
('63', '63', '63', 63, NULL),
('81', '18', '81', 81, NULL),
('2', '123', '66', 1234, NULL),
('1234', '1234', '1235', 1236, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_citas`
--

CREATE TABLE `tipos_citas` (
  `id_citas` int(11) NOT NULL,
  `nombre_cita` varchar(45) NOT NULL,
  `valor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipos_citas`
--

INSERT INTO `tipos_citas` (`id_citas`, `nombre_cita`, `valor`) VALUES
(1, 'Cita medica', 3000),
(2, 'Cita odontologica', 5000),
(3, 'Cita prioritaria', 15000),
(4, 'Emergencia', 0),
(5, 'Urgencia', 0),
(6, 'Atencion prioritaria', 0),
(7, 'Consulta externa', 0),
(8, 'Urgencia no vital', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`telefono`),
  ADD KEY `ix_persona_tipos_citas` (`tipo_cita`);

--
-- Indices de la tabla `tipos_citas`
--
ALTER TABLE `tipos_citas`
  ADD PRIMARY KEY (`id_citas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tipos_citas`
--
ALTER TABLE `tipos_citas`
  MODIFY `id_citas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_persona_tipos_cita` FOREIGN KEY (`tipo_cita`) REFERENCES `tipos_citas` (`id_citas`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
