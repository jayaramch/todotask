/*
SQLyog Community v9.51 
MySQL - 5.6.36 : Database - todo_tasks
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`todo_tasks` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `todo_tasks`;

/*Table structure for table `tasks` */

DROP TABLE IF EXISTS `tasks`;

CREATE TABLE `tasks` (
  `task_id` int(10) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(20) DEFAULT NULL,
  `is_mark_complete` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

/*Data for the table `tasks` */

insert  into `tasks`(`task_id`,`task_name`,`is_mark_complete`) values (1,'Test',0),(2,'Test',1),(3,'Test',1),(4,'New Task',0),(5,'New Task',0),(6,'Added',0),(7,'Test',0),(8,'Test',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
