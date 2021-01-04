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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `classify` */

insert  into `classify`(`classify_id`,`classify_name`,`classify_create_time`) values (5,'传奇世界吧','2021-01-03 06:38:45'),(7,'程序员吧','2021-01-03 06:40:24'),(8,'伊利丹吧','2021-01-03 06:48:09'),(9,'琼瑶吧','2021-01-03 06:52:53'),(11,'Spring吧','2021-01-03 06:59:38'),(12,'SpringBoot吧','2021-01-03 07:03:24'),(16,'超级女声吧','2021-01-04 11:06:00');

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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `posts` */

insert  into `posts`(`posts_id`,`posts_theme`,`posts_content`,`posts_author`,`posts_public_time`,`classify_id`) values (11,' 几年不上，直接不会玩了，主体，儿子被秒了3.4次，做个主线任','年不上，直接不会玩了，主体，儿子被秒了3.4次，做个主线任务，小怪都抗不住，海底小螃蟹好厉害，3.5个就能***。前几天玩私服玩了2天没有意思，就又有个兴趣上来看看，各种真火，翅膀，法宝，看不懂了，玩了2天有些问题想请教各位大神。\r\n1.九等王爵升八等王爵是不是必须在皇宫交4职业各5套准备?\r\n2.仙元心法怎么升?\r\n3.定制的武器，宝甲跟衣服融合，巅峰，洪荒，苍穹，太初，我只融过巅峰，洪荒，现在是直接融后面的装备?还是从低到高的合?我是战士要是合其他职业可以吗?\r\n不求能杀人，但求能打打怪，做做任务，搞那些能提升自己的攻防水平?','大味道名字真烦','2021-01-03 22:16:42',5),(12,'玩传世的进来看，提防骗子！','太容易相信别人，真的吃亏！\r\n我想买这人的元宝，他说认识斗鱼帅帅，还发了帅帅给他发的一百块钱的截图，本来找帅帅担保，后来说帅帅忙，我说那就得十块十块交易，他让我先红包，我说可以，我觉得骗十块钱不至于吧！没想到这个人这么没底线！\r\n发这个贴吧，只是提醒大家，引以为戒，避免上当！','释为天','2021-01-03 22:17:34',5),(13,' 时光倒流群逗比游戏欢乐多（此贴无关行会恩怨，全部实名制）','手术刀忧郁的站在北冥安全区，nn的，这日子没法活了，被情谊那几个大号，打的鼻青脸肿。自己明明是个帅气可爱的医生，却在游戏里救不了自己，天天缺血，缺蓝。唉！苍天啊，大地啊，来几个人把那些专杀小号的给拉出去毙了。正忧郁中，，飞虎一号嗖的飞了过来，手术刀嘿嘿一笑，这不是群里那个**么。\r\n\r\n飞虎一号买好药，正准备北冥去打几个怪，看见了手术刀傻憨憨，便随即甩了几个狂龙。两人出了安全区，正准备与怪物大干一场。道符还没有甩出，只见不远处站了个敌对行会的，名叫冥王，还没有看见脸，冥王几个狂龙便已打的两人眼冒金星。\r\n\r\n二人仓皇逃回安全区，两人不约而同的想到群里的土豪温柔一电。于是群里喊了喊一电小朋友，没想到一电小朋友居然潜水去了太平洋。\r\n\r\n群里迎面走来一个道士醉清风，飞虎一号连哭带嚎的把他喊来帮忙。','雨落倾城醉相思','2021-01-03 22:18:26',5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
