-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-11-2013 a las 21:26:20
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `centro_odontologico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedad_pac`
--

CREATE TABLE IF NOT EXISTS `enfermedad_pac` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `enf_nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE IF NOT EXISTS `historia_clinica` (
  `nro_hc` int(7) NOT NULL AUTO_INCREMENT,
  `enfermedad` tinyint(1) NOT NULL,
  PRIMARY KEY (`nro_hc`),
  UNIQUE KEY `nro_hc` (`nro_hc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `pac_paciente` int(11) NOT NULL AUTO_INCREMENT,
  `pac_tipocedula` varchar(2) NOT NULL,
  `pac_cedula` varchar(10) NOT NULL,
  `pac_nombres` varchar(35) NOT NULL,
  `pac_apellidos` varchar(35) NOT NULL,
  `pac_sexo` varchar(1) NOT NULL,
  `pac_fecha` date NOT NULL,
  `pac_edad` varchar(2) NOT NULL,
  `pac_direccion` varchar(100) NOT NULL,
  `pac_nombrespm` varchar(35) NOT NULL,
  `pac_apellidospm` varchar(35) NOT NULL,
  `pac_codtmovil` varchar(4) NOT NULL,
  `pac_numtmovil` varchar(7) NOT NULL,
  `pac_codtfijo` varchar(4) NOT NULL,
  `pac_numtfijo` varchar(7) NOT NULL,
  `pac_correo` varchar(40) NOT NULL,
  `pac_correo1` varchar(7) NOT NULL,
  `pac_correo2` varchar(4) NOT NULL,
  `pac_status` varchar(1) NOT NULL,
  PRIMARY KEY (`pac_paciente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`pac_paciente`, `pac_tipocedula`, `pac_cedula`, `pac_nombres`, `pac_apellidos`, `pac_sexo`, `pac_fecha`, `pac_edad`, `pac_direccion`, `pac_nombrespm`, `pac_apellidospm`, `pac_codtmovil`, `pac_numtmovil`, `pac_codtfijo`, `pac_numtfijo`, `pac_correo`, `pac_correo1`, `pac_correo2`, `pac_status`) VALUES
(1, 'V-', '1234', 'wfwf', 'wfwefew', 'M', '2013-10-28', '12', 'dawadwad', '', '', '0414', '12212', '0251', '12121', 'dawdwadaw', 'hotmail', 'com', 'A'),
(2, 'V-', '21212', 'dasefsefse', 'fsefsef', 'M', '2013-10-28', '3', 'wdadaw', '', '', '0424', '121212', '0251', '121212', 'dawdadad', 'hotmail', 'com', 'A'),
(4, 'V-', '21203413', 'jesus ', 'de andrade', 'M', '1992-09-25', '21', 'awdwdajwdkjnakjdwd', '', '', '0424', '1589654', '0251', '7894561', 'dwadawd', 'hotmail', 'com', 'I'),
(5, 'V-', '1597814', 'hghghgjg', 'ggygyugu', 'M', '1992-09-25', '21', 'hhghgfhfhfghf', '', '', '0414', '4546465', '0251', '1234567', 'hjhhjhjhjhk', 'hotmail', 'com', 'A'),
(6, 'V-', '8741965', 'mercedes', 'deandrade', 'F', '1976-08-13', '37', 'agua viva', '', '', '0414', '554545', '0251', '1234567', 'awdffefsef', 'hotmail', 'com', 'A'),
(7, 'V-', '8741966', 'bernardete', 'de andrade', 'F', '1979-11-14', '33', 'cabudare', 'najnajdn', 'de andrade', '', '', '', '', '', '', '', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ref_doctor`
--

CREATE TABLE IF NOT EXISTS `ref_doctor` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `ref_nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `id_2` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
