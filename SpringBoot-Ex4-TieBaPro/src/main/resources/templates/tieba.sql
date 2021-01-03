/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.29 : Database - tieba
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tieba` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tieba`;

/*Table structure for table `classify` */

DROP TABLE IF EXISTS `classify`;

CREATE TABLE `classify` (
  `classify_id` int(10) NOT NULL AUTO_INCREMENT,
  `classify_name` varchar(100) NOT NULL,
  `classify_create_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`classify_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `classify` */

insert  into `classify`(`classify_id`,`classify_name`,`classify_create_time`) values (1,'魔兽世界','2020-12-30 20:48:04'),(2,'李毅吧','2020-12-30 20:48:19');

/*Table structure for table `posts` */

DROP TABLE IF EXISTS `posts`;

CREATE TABLE `posts` (
  `posts_id` int(10) NOT NULL AUTO_INCREMENT,
  `posts_theme` varchar(500) NOT NULL,
  `posts_content` varchar(5000) DEFAULT NULL,
  `posts_author` varchar(100) DEFAULT NULL,
  `posts_public_time` varchar(50) DEFAULT NULL,
  `classify_id` int(10) NOT NULL,
  PRIMARY KEY (`posts_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `posts` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
