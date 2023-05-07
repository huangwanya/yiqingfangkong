-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmn87ov
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssmn87ov`
--

/*!40000 DROP DATABASE IF EXISTS `ssmn87ov`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmn87ov` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmn87ov`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emailregistercode`
--

DROP TABLE IF EXISTS `emailregistercode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emailregistercode` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `email` varchar(200) NOT NULL COMMENT '邮箱',
  `role` varchar(200) NOT NULL COMMENT '角色',
  `code` varchar(200) NOT NULL COMMENT '验证码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='邮箱验证码';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emailregistercode`
--

LOCK TABLES `emailregistercode` WRITE;
/*!40000 ALTER TABLE `emailregistercode` DISABLE KEYS */;
INSERT INTO `emailregistercode` VALUES (161,'2022-04-11 02:18:01','邮箱1','角色1','验证码1'),(162,'2022-04-11 02:18:01','邮箱2','角色2','验证码2'),(163,'2022-04-11 02:18:01','邮箱3','角色3','验证码3'),(164,'2022-04-11 02:18:01','邮箱4','角色4','验证码4'),(165,'2022-04-11 02:18:01','邮箱5','角色5','验证码5'),(166,'2022-04-11 02:18:01','邮箱6','角色6','验证码6');
/*!40000 ALTER TABLE `emailregistercode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fangyixinxi`
--

DROP TABLE IF EXISTS `fangyixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fangyixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinximingcheng` varchar(200) NOT NULL COMMENT '信息名称',
  `xinxifengmian` varchar(200) DEFAULT NULL COMMENT '信息封面',
  `yiqingdizhi` varchar(200) NOT NULL COMMENT '疫情地址',
  `huodongzongji` longtext COMMENT '活动踪迹',
  `xinxineirong` longtext COMMENT '信息内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='防疫信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fangyixinxi`
--

LOCK TABLES `fangyixinxi` WRITE;
/*!40000 ALTER TABLE `fangyixinxi` DISABLE KEYS */;
INSERT INTO `fangyixinxi` VALUES (31,'2022-04-11 02:18:01','信息名称1','upload/fangyixinxi_xinxifengmian1.jpg','疫情地址1','活动踪迹1','信息内容1','2022-04-11'),(32,'2022-04-11 02:18:01','信息名称2','upload/fangyixinxi_xinxifengmian2.jpg','疫情地址2','活动踪迹2','信息内容2','2022-04-11'),(33,'2022-04-11 02:18:01','信息名称3','upload/fangyixinxi_xinxifengmian3.jpg','疫情地址3','活动踪迹3','信息内容3','2022-04-11'),(34,'2022-04-11 02:18:01','信息名称4','upload/fangyixinxi_xinxifengmian4.jpg','疫情地址4','活动踪迹4','信息内容4','2022-04-11'),(35,'2022-04-11 02:18:01','信息名称5','upload/fangyixinxi_xinxifengmian5.jpg','疫情地址5','活动踪迹5','信息内容5','2022-04-11'),(36,'2022-04-11 02:18:01','信息名称6','upload/fangyixinxi_xinxifengmian6.jpg','疫情地址6','活动踪迹6','信息内容6','2022-04-11');
/*!40000 ALTER TABLE `fangyixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fengkongxinxi`
--

DROP TABLE IF EXISTS `fengkongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fengkongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fengkongmingcheng` varchar(200) NOT NULL COMMENT '封控名称',
  `louhao` varchar(200) NOT NULL COMMENT '楼号',
  `zhuangtai` varchar(200) NOT NULL COMMENT '状态',
  `fengkongneirong` longtext COMMENT '封控内容',
  `gengxinriqi` date DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='封控信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fengkongxinxi`
--

LOCK TABLES `fengkongxinxi` WRITE;
/*!40000 ALTER TABLE `fengkongxinxi` DISABLE KEYS */;
INSERT INTO `fengkongxinxi` VALUES (131,'2022-04-11 02:18:01','封控名称1','楼号1','正常','封控内容1','2022-04-11'),(132,'2022-04-11 02:18:01','封控名称2','楼号2','正常','封控内容2','2022-04-11'),(133,'2022-04-11 02:18:01','封控名称3','楼号3','正常','封控内容3','2022-04-11'),(134,'2022-04-11 02:18:01','封控名称4','楼号4','正常','封控内容4','2022-04-11'),(135,'2022-04-11 02:18:01','封控名称5','楼号5','正常','封控内容5','2022-04-11'),(136,'2022-04-11 02:18:01','封控名称6','楼号6','正常','封控内容6','2022-04-11');
/*!40000 ALTER TABLE `fengkongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ganranxinxi`
--

DROP TABLE IF EXISTS `ganranxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ganranxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `ganranzhuangtai` varchar(200) NOT NULL COMMENT '感染状态',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `dengjibeizhu` varchar(200) DEFAULT NULL COMMENT '登记备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='感染信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ganranxinxi`
--

LOCK TABLES `ganranxinxi` WRITE;
/*!40000 ALTER TABLE `ganranxinxi` DISABLE KEYS */;
INSERT INTO `ganranxinxi` VALUES (151,'2022-04-11 02:18:01','标题1','账号1','姓名1','家庭住址1','确诊感染','2022-04-11','登记备注1'),(152,'2022-04-11 02:18:01','标题2','账号2','姓名2','家庭住址2','确诊感染','2022-04-11','登记备注2'),(153,'2022-04-11 02:18:01','标题3','账号3','姓名3','家庭住址3','确诊感染','2022-04-11','登记备注3'),(154,'2022-04-11 02:18:01','标题4','账号4','姓名4','家庭住址4','确诊感染','2022-04-11','登记备注4'),(155,'2022-04-11 02:18:01','标题5','账号5','姓名5','家庭住址5','确诊感染','2022-04-11','登记备注5'),(156,'2022-04-11 02:18:01','标题6','账号6','姓名6','家庭住址6','确诊感染','2022-04-11','登记备注6');
/*!40000 ALTER TABLE `ganranxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gelixinxi`
--

DROP TABLE IF EXISTS `gelixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gelixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `gelileixing` varchar(200) NOT NULL COMMENT '隔离类型',
  `gelishijian` datetime DEFAULT NULL COMMENT '隔离时间',
  `gelibeizhu` varchar(200) DEFAULT NULL COMMENT '隔离备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='隔离信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gelixinxi`
--

LOCK TABLES `gelixinxi` WRITE;
/*!40000 ALTER TABLE `gelixinxi` DISABLE KEYS */;
INSERT INTO `gelixinxi` VALUES (141,'2022-04-11 02:18:01','标题1','账号1','姓名1','家庭住址1','集中隔离','2022-04-11 10:18:01','隔离备注1'),(142,'2022-04-11 02:18:01','标题2','账号2','姓名2','家庭住址2','集中隔离','2022-04-11 10:18:01','隔离备注2'),(143,'2022-04-11 02:18:01','标题3','账号3','姓名3','家庭住址3','集中隔离','2022-04-11 10:18:01','隔离备注3'),(144,'2022-04-11 02:18:01','标题4','账号4','姓名4','家庭住址4','集中隔离','2022-04-11 10:18:01','隔离备注4'),(145,'2022-04-11 02:18:01','标题5','账号5','姓名5','家庭住址5','集中隔离','2022-04-11 10:18:01','隔离备注5'),(146,'2022-04-11 02:18:01','标题6','账号6','姓名6','家庭住址6','集中隔离','2022-04-11 10:18:01','隔离备注6');
/*!40000 ALTER TABLE `gelixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) NOT NULL COMMENT '公告标题',
  `gonggaofengmian` varchar(200) DEFAULT NULL COMMENT '公告封面',
  `gonggaojianjie` longtext COMMENT '公告简介',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (21,'2022-04-11 02:18:01','公告标题1','upload/gonggaoxinxi_gonggaofengmian1.jpg','公告简介1','公告内容1','2022-04-11'),(22,'2022-04-11 02:18:01','公告标题2','upload/gonggaoxinxi_gonggaofengmian2.jpg','公告简介2','公告内容2','2022-04-11'),(23,'2022-04-11 02:18:01','公告标题3','upload/gonggaoxinxi_gonggaofengmian3.jpg','公告简介3','公告内容3','2022-04-11'),(24,'2022-04-11 02:18:01','公告标题4','upload/gonggaoxinxi_gonggaofengmian4.jpg','公告简介4','公告内容4','2022-04-11'),(25,'2022-04-11 02:18:01','公告标题5','upload/gonggaoxinxi_gonggaofengmian5.jpg','公告简介5','公告内容5','2022-04-11'),(26,'2022-04-11 02:18:01','公告标题6','upload/gonggaoxinxi_gonggaofengmian6.jpg','公告简介6','公告内容6','2022-04-11');
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangdaka`
--

DROP TABLE IF EXISTS `jiankangdaka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangdaka` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dakabianhao` varchar(200) DEFAULT NULL COMMENT '打卡编号',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `tiwen` int(11) NOT NULL COMMENT '体温',
  `xingchengguiji` longtext COMMENT '行程轨迹',
  `jiankangma` varchar(200) DEFAULT NULL COMMENT '健康码',
  `dakabeizhu` varchar(200) DEFAULT NULL COMMENT '打卡备注',
  `dakashijian` datetime DEFAULT NULL COMMENT '打卡时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dakabianhao` (`dakabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='健康打卡';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangdaka`
--

LOCK TABLES `jiankangdaka` WRITE;
/*!40000 ALTER TABLE `jiankangdaka` DISABLE KEYS */;
INSERT INTO `jiankangdaka` VALUES (51,'2022-04-11 02:18:01','1111111111','账号1','姓名1','手机号码1','家庭住址1',1,'行程轨迹1','upload/jiankangdaka_jiankangma1.jpg','打卡备注1','2022-04-11 10:18:01'),(52,'2022-04-11 02:18:01','2222222222','账号2','姓名2','手机号码2','家庭住址2',2,'行程轨迹2','upload/jiankangdaka_jiankangma2.jpg','打卡备注2','2022-04-11 10:18:01'),(53,'2022-04-11 02:18:01','3333333333','账号3','姓名3','手机号码3','家庭住址3',3,'行程轨迹3','upload/jiankangdaka_jiankangma3.jpg','打卡备注3','2022-04-11 10:18:01'),(54,'2022-04-11 02:18:01','4444444444','账号4','姓名4','手机号码4','家庭住址4',4,'行程轨迹4','upload/jiankangdaka_jiankangma4.jpg','打卡备注4','2022-04-11 10:18:01'),(55,'2022-04-11 02:18:01','5555555555','账号5','姓名5','手机号码5','家庭住址5',5,'行程轨迹5','upload/jiankangdaka_jiankangma5.jpg','打卡备注5','2022-04-11 10:18:01'),(56,'2022-04-11 02:18:01','6666666666','账号6','姓名6','手机号码6','家庭住址6',6,'行程轨迹6','upload/jiankangdaka_jiankangma6.jpg','打卡备注6','2022-04-11 10:18:01');
/*!40000 ALTER TABLE `jiankangdaka` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiezhongxinxi`
--

DROP TABLE IF EXISTS `jiezhongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiezhongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiezhongmingcheng` varchar(200) NOT NULL COMMENT '接种名称',
  `yimiaoxinghao` varchar(200) NOT NULL COMMENT '疫苗型号',
  `jiezhongcishu` int(11) NOT NULL COMMENT '接种次数',
  `jiezhongshijian` datetime DEFAULT NULL COMMENT '接种时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='接种信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiezhongxinxi`
--

LOCK TABLES `jiezhongxinxi` WRITE;
/*!40000 ALTER TABLE `jiezhongxinxi` DISABLE KEYS */;
INSERT INTO `jiezhongxinxi` VALUES (71,'2022-04-11 02:18:01','接种名称1','疫苗型号1',1,'2022-04-11 10:18:01','账号1','姓名1','手机号码1'),(72,'2022-04-11 02:18:01','接种名称2','疫苗型号2',1,'2022-04-11 10:18:01','账号2','姓名2','手机号码2'),(73,'2022-04-11 02:18:01','接种名称3','疫苗型号3',1,'2022-04-11 10:18:01','账号3','姓名3','手机号码3'),(74,'2022-04-11 02:18:01','接种名称4','疫苗型号4',1,'2022-04-11 10:18:01','账号4','姓名4','手机号码4'),(75,'2022-04-11 02:18:01','接种名称5','疫苗型号5',1,'2022-04-11 10:18:01','账号5','姓名5','手机号码5'),(76,'2022-04-11 02:18:01','接种名称6','疫苗型号6',1,'2022-04-11 10:18:01','账号6','姓名6','手机号码6');
/*!40000 ALTER TABLE `jiezhongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jubaoxinxi`
--

DROP TABLE IF EXISTS `jubaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jubaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jubaobianhao` varchar(200) DEFAULT NULL COMMENT '举报编号',
  `jubaomingcheng` varchar(200) NOT NULL COMMENT '举报名称',
  `jubaoneirong` longtext COMMENT '举报内容',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jubaoriqi` date DEFAULT NULL COMMENT '举报日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jubaobianhao` (`jubaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='举报信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jubaoxinxi`
--

LOCK TABLES `jubaoxinxi` WRITE;
/*!40000 ALTER TABLE `jubaoxinxi` DISABLE KEYS */;
INSERT INTO `jubaoxinxi` VALUES (81,'2022-04-11 02:18:01','1111111111','举报名称1','举报内容1','账号1','姓名1','2022-04-11','是',''),(82,'2022-04-11 02:18:01','2222222222','举报名称2','举报内容2','账号2','姓名2','2022-04-11','是',''),(83,'2022-04-11 02:18:01','3333333333','举报名称3','举报内容3','账号3','姓名3','2022-04-11','是',''),(84,'2022-04-11 02:18:01','4444444444','举报名称4','举报内容4','账号4','姓名4','2022-04-11','是',''),(85,'2022-04-11 02:18:01','5555555555','举报名称5','举报内容5','账号5','姓名5','2022-04-11','是',''),(86,'2022-04-11 02:18:01','6666666666','举报名称6','举报内容6','账号6','姓名6','2022-04-11','是','');
/*!40000 ALTER TABLE `jubaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jumin`
--

DROP TABLE IF EXISTS `jumin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jumin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='居民';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jumin`
--

LOCK TABLES `jumin` WRITE;
/*!40000 ALTER TABLE `jumin` DISABLE KEYS */;
INSERT INTO `jumin` VALUES (11,'2022-04-11 02:18:01','账号1','123456','姓名1','男','13823888881','年龄1','家庭住址1','upload/jumin_xiangpian1.jpg','773890001@qq.com'),(12,'2022-04-11 02:18:01','账号2','123456','姓名2','男','13823888882','年龄2','家庭住址2','upload/jumin_xiangpian2.jpg','773890002@qq.com'),(13,'2022-04-11 02:18:01','账号3','123456','姓名3','男','13823888883','年龄3','家庭住址3','upload/jumin_xiangpian3.jpg','773890003@qq.com'),(14,'2022-04-11 02:18:01','账号4','123456','姓名4','男','13823888884','年龄4','家庭住址4','upload/jumin_xiangpian4.jpg','773890004@qq.com'),(15,'2022-04-11 02:18:01','账号5','123456','姓名5','男','13823888885','年龄5','家庭住址5','upload/jumin_xiangpian5.jpg','773890005@qq.com'),(16,'2022-04-11 02:18:01','账号6','123456','姓名6','男','13823888886','年龄6','家庭住址6','upload/jumin_xiangpian6.jpg','773890006@qq.com');
/*!40000 ALTER TABLE `jumin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renyuanbaobei`
--

DROP TABLE IF EXISTS `renyuanbaobei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `renyuanbaobei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `baobeibianhao` varchar(200) DEFAULT NULL COMMENT '报备编号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `jiatingzhuzhi` varchar(200) NOT NULL COMMENT '家庭住址',
  `jiankangma` varchar(200) DEFAULT NULL COMMENT '健康码',
  `xingchengguiji` longtext COMMENT '行程轨迹',
  `tiwen` int(11) DEFAULT NULL COMMENT '体温',
  `jiancejieguo` varchar(200) NOT NULL COMMENT '检测结果',
  `baobeiriqi` date DEFAULT NULL COMMENT '报备日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `baobeibianhao` (`baobeibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='人员报备';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renyuanbaobei`
--

LOCK TABLES `renyuanbaobei` WRITE;
/*!40000 ALTER TABLE `renyuanbaobei` DISABLE KEYS */;
INSERT INTO `renyuanbaobei` VALUES (121,'2022-04-11 02:18:01','1111111111','姓名1','男',1,'13823888881','家庭住址1','upload/renyuanbaobei_jiankangma1.jpg','行程轨迹1',1,'阴性','2022-04-11'),(122,'2022-04-11 02:18:01','2222222222','姓名2','男',2,'13823888882','家庭住址2','upload/renyuanbaobei_jiankangma2.jpg','行程轨迹2',2,'阴性','2022-04-11'),(123,'2022-04-11 02:18:01','3333333333','姓名3','男',3,'13823888883','家庭住址3','upload/renyuanbaobei_jiankangma3.jpg','行程轨迹3',3,'阴性','2022-04-11'),(124,'2022-04-11 02:18:01','4444444444','姓名4','男',4,'13823888884','家庭住址4','upload/renyuanbaobei_jiankangma4.jpg','行程轨迹4',4,'阴性','2022-04-11'),(125,'2022-04-11 02:18:01','5555555555','姓名5','男',5,'13823888885','家庭住址5','upload/renyuanbaobei_jiankangma5.jpg','行程轨迹5',5,'阴性','2022-04-11'),(126,'2022-04-11 02:18:01','6666666666','姓名6','男',6,'13823888886','家庭住址6','upload/renyuanbaobei_jiankangma6.jpg','行程轨迹6',6,'阴性','2022-04-11');
/*!40000 ALTER TABLE `renyuanbaobei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shenqingchuru`
--

DROP TABLE IF EXISTS `shenqingchuru`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shenqingchuru` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shenqingbianhao` varchar(200) DEFAULT NULL COMMENT '申请编号',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `jiankangma` varchar(200) DEFAULT NULL COMMENT '健康码',
  `tiwenxinxi` int(11) NOT NULL COMMENT '体温信息',
  `xingchengguiji` longtext COMMENT '行程轨迹',
  `shenqingliyou` longtext COMMENT '申请理由',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shenqingbianhao` (`shenqingbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='申请出入';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shenqingchuru`
--

LOCK TABLES `shenqingchuru` WRITE;
/*!40000 ALTER TABLE `shenqingchuru` DISABLE KEYS */;
INSERT INTO `shenqingchuru` VALUES (41,'2022-04-11 02:18:01','1111111111','账号1','姓名1','手机号码1','家庭住址1','upload/shenqingchuru_jiankangma1.jpg',1,'行程轨迹1','申请理由1','2022-04-11','是',''),(42,'2022-04-11 02:18:01','2222222222','账号2','姓名2','手机号码2','家庭住址2','upload/shenqingchuru_jiankangma2.jpg',2,'行程轨迹2','申请理由2','2022-04-11','是',''),(43,'2022-04-11 02:18:01','3333333333','账号3','姓名3','手机号码3','家庭住址3','upload/shenqingchuru_jiankangma3.jpg',3,'行程轨迹3','申请理由3','2022-04-11','是',''),(44,'2022-04-11 02:18:01','4444444444','账号4','姓名4','手机号码4','家庭住址4','upload/shenqingchuru_jiankangma4.jpg',4,'行程轨迹4','申请理由4','2022-04-11','是',''),(45,'2022-04-11 02:18:01','5555555555','账号5','姓名5','手机号码5','家庭住址5','upload/shenqingchuru_jiankangma5.jpg',5,'行程轨迹5','申请理由5','2022-04-11','是',''),(46,'2022-04-11 02:18:01','6666666666','账号6','姓名6','手机号码6','家庭住址6','upload/shenqingchuru_jiankangma6.jpg',6,'行程轨迹6','申请理由6','2022-04-11','是','');
/*!40000 ALTER TABLE `shenqingchuru` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-11 02:18:01');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzifenpei`
--

DROP TABLE IF EXISTS `wuzifenpei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzifenpei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `wuzifenlei` varchar(200) DEFAULT NULL COMMENT '物资分类',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `fenpeineirong` longtext COMMENT '分配内容',
  `fenpeiriqi` datetime DEFAULT NULL COMMENT '分配日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='物资分配';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzifenpei`
--

LOCK TABLES `wuzifenpei` WRITE;
/*!40000 ALTER TABLE `wuzifenpei` DISABLE KEYS */;
INSERT INTO `wuzifenpei` VALUES (111,'2022-04-11 02:18:01','物资名称1','物资分类1',1,'分配内容1','2022-04-11 10:18:01','账号1','姓名1','手机号码1'),(112,'2022-04-11 02:18:01','物资名称2','物资分类2',2,'分配内容2','2022-04-11 10:18:01','账号2','姓名2','手机号码2'),(113,'2022-04-11 02:18:01','物资名称3','物资分类3',3,'分配内容3','2022-04-11 10:18:01','账号3','姓名3','手机号码3'),(114,'2022-04-11 02:18:01','物资名称4','物资分类4',4,'分配内容4','2022-04-11 10:18:01','账号4','姓名4','手机号码4'),(115,'2022-04-11 02:18:01','物资名称5','物资分类5',5,'分配内容5','2022-04-11 10:18:01','账号5','姓名5','手机号码5'),(116,'2022-04-11 02:18:01','物资名称6','物资分类6',6,'分配内容6','2022-04-11 10:18:01','账号6','姓名6','手机号码6');
/*!40000 ALTER TABLE `wuzifenpei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzishenqing`
--

DROP TABLE IF EXISTS `wuzishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `wuzifenlei` varchar(200) DEFAULT NULL COMMENT '物资分类',
  `shenqingshuliang` int(11) NOT NULL COMMENT '申请数量',
  `shenqingyuanyin` longtext COMMENT '申请原因',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='物资申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzishenqing`
--

LOCK TABLES `wuzishenqing` WRITE;
/*!40000 ALTER TABLE `wuzishenqing` DISABLE KEYS */;
INSERT INTO `wuzishenqing` VALUES (101,'2022-04-11 02:18:01','物资名称1','物资分类1',1,'申请原因1','2022-04-11','账号1','姓名1','手机号码1','是',''),(102,'2022-04-11 02:18:01','物资名称2','物资分类2',2,'申请原因2','2022-04-11','账号2','姓名2','手机号码2','是',''),(103,'2022-04-11 02:18:01','物资名称3','物资分类3',3,'申请原因3','2022-04-11','账号3','姓名3','手机号码3','是',''),(104,'2022-04-11 02:18:01','物资名称4','物资分类4',4,'申请原因4','2022-04-11','账号4','姓名4','手机号码4','是',''),(105,'2022-04-11 02:18:01','物资名称5','物资分类5',5,'申请原因5','2022-04-11','账号5','姓名5','手机号码5','是',''),(106,'2022-04-11 02:18:01','物资名称6','物资分类6',6,'申请原因6','2022-04-11','账号6','姓名6','手机号码6','是','');
/*!40000 ALTER TABLE `wuzishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzixinxi`
--

DROP TABLE IF EXISTS `wuzixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzimingcheng` varchar(200) NOT NULL COMMENT '物资名称',
  `wuzifengmian` varchar(200) DEFAULT NULL COMMENT '物资封面',
  `wuzifenlei` varchar(200) DEFAULT NULL COMMENT '物资分类',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `chucunweizhi` varchar(200) NOT NULL COMMENT '储存位置',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `wuzijianjie` longtext COMMENT '物资简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='物资信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzixinxi`
--

LOCK TABLES `wuzixinxi` WRITE;
/*!40000 ALTER TABLE `wuzixinxi` DISABLE KEYS */;
INSERT INTO `wuzixinxi` VALUES (91,'2022-04-11 02:18:01','物资名称1','upload/wuzixinxi_wuzifengmian1.jpg','口罩',1,'储存位置1','备注1','物资简介1'),(92,'2022-04-11 02:18:01','物资名称2','upload/wuzixinxi_wuzifengmian2.jpg','口罩',2,'储存位置2','备注2','物资简介2'),(93,'2022-04-11 02:18:01','物资名称3','upload/wuzixinxi_wuzifengmian3.jpg','口罩',3,'储存位置3','备注3','物资简介3'),(94,'2022-04-11 02:18:01','物资名称4','upload/wuzixinxi_wuzifengmian4.jpg','口罩',4,'储存位置4','备注4','物资简介4'),(95,'2022-04-11 02:18:01','物资名称5','upload/wuzixinxi_wuzifengmian5.jpg','口罩',5,'储存位置5','备注5','物资简介5'),(96,'2022-04-11 02:18:01','物资名称6','upload/wuzixinxi_wuzifengmian6.jpg','口罩',6,'储存位置6','备注6','物资简介6');
/*!40000 ALTER TABLE `wuzixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yimiaoxinxi`
--

DROP TABLE IF EXISTS `yimiaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yimiaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yimiaoxinghao` varchar(200) NOT NULL COMMENT '疫苗型号',
  `shengchanshang` varchar(200) NOT NULL COMMENT '生产商',
  `yimiaojianjie` longtext COMMENT '疫苗简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='疫苗信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yimiaoxinxi`
--

LOCK TABLES `yimiaoxinxi` WRITE;
/*!40000 ALTER TABLE `yimiaoxinxi` DISABLE KEYS */;
INSERT INTO `yimiaoxinxi` VALUES (61,'2022-04-11 02:18:01','疫苗型号1','生产商1','疫苗简介1'),(62,'2022-04-11 02:18:01','疫苗型号2','生产商2','疫苗简介2'),(63,'2022-04-11 02:18:01','疫苗型号3','生产商3','疫苗简介3'),(64,'2022-04-11 02:18:01','疫苗型号4','生产商4','疫苗简介4'),(65,'2022-04-11 02:18:01','疫苗型号5','生产商5','疫苗简介5'),(66,'2022-04-11 02:18:01','疫苗型号6','生产商6','疫苗简介6');
/*!40000 ALTER TABLE `yimiaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-15 10:35:15
