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
-- Table structure for table `k_pac`
--

DROP TABLE IF EXISTS `k_pac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `k_pac` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(250) CHARACTER SET utf8 DEFAULT NULL,
  `description` varchar(2000) CHARACTER SET utf8 DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `k_pac`
--

LOCK TABLES `k_pac` WRITE;
/*!40000 ALTER TABLE `k_pac` DISABLE KEYS */;
INSERT INTO `k_pac` VALUES (3,'Hello world','This new creature with the long hair is a good deal in the way. It is always\nhanging around and following me about. I don\'t like this; I am not used to\ncompany. I wish it would stay with the other animals. Cloudy to-day, wind in\nthe east; think we shall have rain.... Where did I get that word?... I remember\nnow —the new creature uses it.\n','2023-03-25'),(4,'Klava','Too many text','2023-03-10'),(5,'HJOK','Been examining the great waterfall. It is the finest thing on the estate, I think. The new creature calls it Niagara Falls—why, I am sure I do not know. Says it looks like Niagara Falls. That is not a reason; it is mere waywardness and imbecility. I get no chance to name anything myself. The new creature names everything that comes along, before I can get in a protest. And always that same pretext is offered—it looks like the thing. There is the dodo, for','2023-03-15'),(6,'Driver','There is the dodo, for instance. Says, the moment one looks at it, one sees at a glance that it \"looks like a dodo.\" It will have to keep that name, no doubt. It wearies me to fret about it, and it does no good, anyway. Dodo! It looks no more like a dodo than I do.','2023-02-27'),(7,'People','Built me a shelter against the rain, but could not have it to myself in peace. The new creature intruded. When I tried to put it out it shed water out of the holes it looks with, and wiped it away with the back of its paws, and made a  noise such as some of the other animals make when they are in distress.','2023-03-27'),(8,'Monkey',' That sounds like a cheap fling at the poor creature, a slur; but I do not mean it so. I have never heard the human voice before, and any new and strange sound intruding itself here upon the solemn hush of these dreaming solitudes offends my ear and seems a false note. And this new sound is so close to me; it is right at my shoulder, right at my ear, first on one side and then on the other, and I am used only to sounds that are more or less distant from me.','2023-03-22'),(9,'Hrrible','The naming goes recklessly on, in spite of anything I can do. I had a very good name for the estate, and it was musical and pretty —GARDEN-OF- EDEN. Privately, I continue to call it that, but not any longer publicly. The new creature says it is all woods and rocks and scenery, and therefore has no','2023-03-12'),(10,'Niagara',' Says it looks like a park, and does not look like anything but a park. Consequently, without consulting me, it has been new- named —NIAGARA FALLS PARK. This is sufficiently high-handed, it seems to me. And already there is a sign up:','2022-10-03'),(11,'Story Tail','The new creature eats too much fruit. We are going to run short, most likely. \"We\" again—that is its word; mine too, now, from hearing it so much. Good deal of fog this morning. I do not go out in the fog myself. The new creature does. ','2023-02-07'),(12,'Laptop','Pulled through. This day is getting to be more and more trying. It was selected and set apart last November as a day of rest. I already had six of them per week, before. This morning found the new creature trying to clod appThe new creature eats too much fruit. We are going to run short, most likely. \"We\" again—that is its word; mine too, now, from hearing it so much. Good deal of fog this morning. I do not go out in the fog myself. The new creature does. les out of that forbidden tree.','2022-11-27'),(13,'Weekend','The new creature says its name is Eve. That is all right, I have no objections. Says it is to call it by when I want it to come. I said it was superfluous, then. The word evidently raised me in its respect; and indeed it is a large, good word, and will bear repetition. It says it is not an It, it is a She. This is probably doubtful; yet it is all one to me; what she is were nothing to me if she would but go by herself and not talk.','2023-03-22'),(14,'JavaScript','To use the toString() method, you simply need to call the method on a number value. The following example shows how to convert the number value 24 into its string representation. Notice how the value of the str variable is enclosed in double quotation marks:','2023-03-15'),(15,'Saturday','She has littered the whole estate with execrable names and offensive signs: THIS WAY TO THE WHIRLPOOL. THIS WAY TO GOAT ISLAND. CAVE OF THE WINDS THIS WAY. She says this park would make a tidy summer resort, if there was any custom for it. Summer resort—another invention of hers—just words, without any meaning. What is a summer resort? But it is best not to ask her, she has such a rage for explaining.','2023-03-16'),(16,'Load','The promise constructor takes a function that will be passed two arguments (let\'s call them resolve and reject). You can think of these as callbacks, one for success and one for failure. Examples are awesome, let\'s update makeRequest with this constructor:','2023-03-22'),(17,'Open','For better crossbrowser compatibility, not only with IE6/7, but also to cover some browser-specific memory leaks or bugs, and also for less verbosity with firing ajaxical requests, you could use jQuery.','2023-03-01'),(18,'Google','Pulled through. This day is getting to be more and more trying. It was selected and set apart last November as a day of rest. I already had six of them per week, before. This morning found the new creature trying to clod appThe new creature eats too much fruit. We are going to run short, most likely. \"We\" again—that is its word; mine too, now, from hearing it so much. Good deal of fog this morning. I do not go out in the fog myself. The new creature does. les out of that forbidden tree','2023-03-09'),(21,'Talk','The new creature says its name is Eve. That is all right, I have no objections. Says it is to call it by when I want it to come. I said it was superfluous, then. The word evidently raised me in its respect; and indeed it is a large, good word, and will bear repetition. It says it is not an It, it is a She. This is probably doubtful; yet it is all one to me; what she is were nothing to me if she would but go by herself and not talk.','2023-03-26'),(22,'Tuesday','Been examining the great waterfall. It is the finest thing on the estate, I think. The new creature calls it Niagara Falls—why, I am sure I do not know. Says it looks like Niagara Falls. That is not a reason; it is mere waywardness and imbecility. I get no chance to name anything myself. The new creature names everything that comes along, before I can get in a protest. And always that same pretext is offered—it looks like the thing. There is the dodo, for instance. Says, the moment one looks at it, one sees at a glance that it \"looks like a dodo.\" It will have to keep that name, no doubt. It wearies me to fret about it, and it does no good, anyway. Dodo! It looks no more like a dodo than I do.','2023-03-12'),(24,'Wednesday','Built me a shelter against the rain, but could not have it to myself in peace. The new creature intruded. When I tried to put it out it shed water out of the holes it looks with, and wiped it away with the back of its paws, and made a  noise such as some of the other animals make when they are in distress. I wish it would not talk; it is always talking. That sounds like a cheap fling at the','2023-03-06'),(25,'Jop',' I have never heard the human voice before, and any new and strange sound intruding itself here upon the solemn hush of these dreaming solitudes offends my ear and seems a false note. And this new sound is so close to me; it is right at my shoulder, right at my ear, first on one side and then on the other, and I am used only to sounds that are more or less distant from me.','2023-03-27'),(29,'tydfj','cfgjhy','2023-03-06');
/*!40000 ALTER TABLE `k_pac` ENABLE KEYS */;
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
