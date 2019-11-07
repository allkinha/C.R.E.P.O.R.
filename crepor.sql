CREATE DATABASE  IF NOT EXISTS `crepor` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `crepor`;
-- MySQL dump 10.13  Distrib 5.7.14, for Win64 (x86_64)
--
-- Host: localhost    Database: crepor
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coleta`
--

DROP TABLE IF EXISTS `coleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coleta` (
  `codPonto` char(2) NOT NULL,
  `codResiduo` int(11) NOT NULL,
  PRIMARY KEY (`codPonto`,`codResiduo`),
  KEY `codResiduo` (`codResiduo`),
  CONSTRAINT `coleta_ibfk_1` FOREIGN KEY (`codPonto`) REFERENCES `pontosdecoleta` (`codPonto`),
  CONSTRAINT `coleta_ibfk_2` FOREIGN KEY (`codResiduo`) REFERENCES `residuo` (`codResiduo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coleta`
--

LOCK TABLES `coleta` WRITE;
/*!40000 ALTER TABLE `coleta` DISABLE KEYS */;
/*!40000 ALTER TABLE `coleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `codEmpresa` int(11) NOT NULL,
  `nomeEmpresa` varchar(45) DEFAULT NULL,
  `cepEmpresa` int(11) DEFAULT NULL,
  `cidadeEmpresa` varchar(45) DEFAULT NULL,
  `bairroEmpresa` varchar(45) DEFAULT NULL,
  `ruaEmpresa` varchar(45) DEFAULT NULL,
  `numeroEmpresa` varchar(45) DEFAULT NULL,
  `emailEmpresa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codEmpresa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'Sistema Integrado de Gestão Ambiental',53159,'São Paulo','Pinheiros','Av. Prof. Frederico Hermann Jr.','345','sigam@ambiente.sp.gov.br'),(2,'Secretaria do Meio Ambiente',NULL,'Bragança Paulista','Jardim Público','Albino Dantas','','smma@braganca.sp.gov.br'),(3,'MB Engenharia e Meio Ambiente',NULL,'São Paulo','Jaguaré','Av José Cesar de Oliveira','181','mbengenharia@mbengenharia.com');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresaresiduo`
--

DROP TABLE IF EXISTS `empresaresiduo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresaresiduo` (
  `codEmpresa` int(11) NOT NULL,
  `codResiduo` int(11) NOT NULL,
  PRIMARY KEY (`codEmpresa`,`codResiduo`),
  KEY `codResiduo` (`codResiduo`),
  CONSTRAINT `empresaresiduo_ibfk_1` FOREIGN KEY (`codEmpresa`) REFERENCES `empresa` (`codEmpresa`),
  CONSTRAINT `empresaresiduo_ibfk_2` FOREIGN KEY (`codResiduo`) REFERENCES `residuo` (`codResiduo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresaresiduo`
--

LOCK TABLES `empresaresiduo` WRITE;
/*!40000 ALTER TABLE `empresaresiduo` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresaresiduo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pontosdecoleta`
--

DROP TABLE IF EXISTS `pontosdecoleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pontosdecoleta` (
  `codPonto` char(2) NOT NULL,
  `nomePonto` varchar(40) DEFAULT NULL,
  `cepPonto` int(11) DEFAULT NULL,
  `cidadePonto` varchar(40) DEFAULT NULL,
  `bairroPonto` varchar(40) DEFAULT NULL,
  `ruaPonto` varchar(40) DEFAULT NULL,
  `numeroPonto` int(11) DEFAULT NULL,
  PRIMARY KEY (`codPonto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pontosdecoleta`
--

LOCK TABLES `pontosdecoleta` WRITE;
/*!40000 ALTER TABLE `pontosdecoleta` DISABLE KEYS */;
INSERT INTO `pontosdecoleta` VALUES ('A1','Justiça do Trabalho',12762,'Bragança Paulista','Jardim América','Av. dos Imigrantes',1387),('A2','Mc Donald\'s',12900,'Bragança Paulista','Taboão','Praça Jean Thomaz Bata',161),('A3','Santander',12544,'Bragança Paulista','Centro','Praça Raul Leme',265),('A4','Drogaria São Paulo',12902,'Bragança Paulista','Jardim América','Av. dos Imigrantes',900),('A5','Estúdio Casarão',12739,'Bragança Paulista','Centro','Cel. João Leme',662),('A6','Farmácia Central ',12739,'Bragança Paulista','Centro','Cel. João Leme',580),('A7','EM Dinorah Ramos Professor',12342,'Bragança Paulista','C. PLANEJADA II','R. Agostinho Rosa',260),('A8','Câmara Municipal',12902230,'Bragança Paulista','Jardim América','Praça Hafiz Abi Chedid',125),('A9','Secretaria Municipal do Meio Ambiente',12572,'Bragança Paulista','Jardim América','Av. dos Imigrantes',1307),('B1','EM Prof Abner Antonio Sperendio',12252,'Bragança Paulista','Cidade Planejada II','R. Juvenal da Silva Guimarães',10),('B2','IFSP - Câmpus Bragança Paulista',12903,'Bragança Paulista','São Miguel','Av. Major Dernando Valle',2013),('B3','MB Engenharia e Meio Ambiente',12970,'Piracaia','Cachoeirinha Baixa','Papa João XXIII',229),('B4','Estação Rodoviária',12930,'Tuiuti','Centro','José Bertholdi',348);
/*!40000 ALTER TABLE `pontosdecoleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `residuo`
--

DROP TABLE IF EXISTS `residuo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `residuo` (
  `codResiduo` int(11) NOT NULL,
  `nomeResiduo` varchar(40) DEFAULT NULL,
  `anosMinDecomp` int(11) DEFAULT NULL,
  `anosMaxDecomp` int(11) DEFAULT NULL,
  PRIMARY KEY (`codResiduo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `residuo`
--

LOCK TABLES `residuo` WRITE;
/*!40000 ALTER TABLE `residuo` DISABLE KEYS */;
INSERT INTO `residuo` VALUES (5,'Remédios',0,0);
/*!40000 ALTER TABLE `residuo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefoneempresa`
--

DROP TABLE IF EXISTS `telefoneempresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefoneempresa` (
  `codEmpresa` int(11) NOT NULL,
  `telefoneFixo` int(11) DEFAULT NULL,
  `telefoneMovel` int(11) DEFAULT NULL,
  PRIMARY KEY (`codEmpresa`),
  CONSTRAINT `telefoneempresa_ibfk_1` FOREIGN KEY (`codEmpresa`) REFERENCES `empresa` (`codEmpresa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefoneempresa`
--

LOCK TABLES `telefoneempresa` WRITE;
/*!40000 ALTER TABLE `telefoneempresa` DISABLE KEYS */;
INSERT INTO `telefoneempresa` VALUES (2,107254,NULL);
/*!40000 ALTER TABLE `telefoneempresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefoneponto`
--

DROP TABLE IF EXISTS `telefoneponto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefoneponto` (
  `codPonto` char(2) NOT NULL,
  `telefoneFixo` int(11) DEFAULT NULL,
  `telefoneMovel` int(11) DEFAULT NULL,
  PRIMARY KEY (`codPonto`),
  CONSTRAINT `telefoneponto_ibfk_1` FOREIGN KEY (`codPonto`) REFERENCES `pontosdecoleta` (`codPonto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefoneponto`
--

LOCK TABLES `telefoneponto` WRITE;
/*!40000 ALTER TABLE `telefoneponto` DISABLE KEYS */;
INSERT INTO `telefoneponto` VALUES ('A1',3053,NULL),('A2',3910,NULL),('A3',-3619,NULL),('A4',-4848,NULL),('A5',1922,NULL),('A6',2801,NULL),('A8',108692,NULL),('A9',113136,NULL),('B1',107476,NULL),('B3',-5270,NULL),('B4',116920,NULL);
/*!40000 ALTER TABLE `telefoneponto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-23 11:22:43
