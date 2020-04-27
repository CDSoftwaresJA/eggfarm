DROP DATABASE IF EXISTS eggfarm;
CREATE DATABASE eggfarm;
USE eggfarm;
DROP TABLE IF EXISTS `subordinate`;
CREATE TABLE `subordinate`(
	`title` char(50) NOT NULL,
	`firstName` char(50) NOT NULL,
	`lastName` char(50) NOT NULL,
	`position` char(50) NOT NULL,
	`emailAddress` char(50) NOT NULL,
	`Contact` char(50) NOT NULL,
	`Username` char(50) NOT NULL,
	`Password` char(50) NOT NULL,
	`.employeeID` char(50) NOT NULL
)ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `supervisor`;
CREATE TABLE `supervisor`(
	`title` char(50) NOT NULL,
	`firstName` char(50) NOT NULL,
	`lastName` char(50) NOT NULL,
	`position` char(50) NOT NULL,
	`emailAddress` char(50) NOT NULL,
	`Contact` char(50) NOT NULL,
	`Username` char(50) NOT NULL,
	`Password` char(50) NOT NULL,
	`employeeID` char(50) NOT NULL

)ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `InternalEggsSupply`;
CREATE TABLE `InternalEggsSupply`(
	`Fullname` char(50) NOT NULL,
	`WorkStation` char(50) NOT NULL,
	`employeeID` char(50) NOT NULL,
	`Collected` char(50) NOT NULL,
	`Spoilt` char(50) NOT NULL,
	`Broken` char(50) NOT NULL
)ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Externaleggsupplier`;
CREATE TABLE `Externaleggsupplier`(
	`firstname` char(50) NOT NULL,
	`lastname` char(50) NOT NULL,
	`farmaddress` char(50) NOT NULL,
	`contactnumber` char(50) NOT NULL
)ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Externaleggsupply`;
CREATE TABLE `Externaleggsupply`(
	`eggscollected` char(50) NOT NULL,
	`collecteddate` char(50) NOT NULL
)ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;




