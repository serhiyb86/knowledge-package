-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: kpac_db
-- ------------------------------------------------------
-- Server version	5.7.41-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `kpac_set_relation`
--

DROP TABLE IF EXISTS `kpac_set_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kpac_set_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kpacs` bigint(20) DEFAULT NULL,
  `sets` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `kpacs` (`kpacs`),
  KEY `sets` (`sets`),
  CONSTRAINT `kpac_set_relation_ibfk1` FOREIGN KEY (`kpacs`) REFERENCES `k_pac` (`id`) ON DELETE CASCADE,
  CONSTRAINT `kpac_set_relation_ibfk_2` FOREIGN KEY (`sets`) REFERENCES `kpac_set` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kpac_set_relation`
--

LOCK TABLES `kpac_set_relation` WRITE;
/*!40000 ALTER TABLE `kpac_set_relation` DISABLE KEYS */;
INSERT INTO `kpac_set_relation` VALUES (3,3,9),(4,4,6),(5,5,6),(6,6,6),(7,7,6),(8,8,6),(9,9,6),(10,10,6),(11,11,6),(12,12,9),(13,13,7),(14,14,9),(15,15,9),(16,16,9),(17,17,9),(18,18,9),(21,21,8),(22,22,5),(24,24,8),(25,25,9),(29,29,6);
/*!40000 ALTER TABLE `kpac_set_relation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-27  0:09:24
