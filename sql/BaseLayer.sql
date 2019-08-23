/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.26 : Database - BaseLayer
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`BaseLayer` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `BaseLayer`;

/*Table structure for table `UserInfo` */

DROP TABLE IF EXISTS `UserInfo`;

CREATE TABLE `UserInfo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `Name` varchar(100) NOT NULL COMMENT '用户名',
  `LoginName` varchar(50) NOT NULL COMMENT '登录名',
  `PassWord` varchar(50) NOT NULL DEFAULT '123qwe' COMMENT '登录密码',
  `WxId` varchar(100) DEFAULT NULL COMMENT '第三方登录',
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `Wx_Button_Menu` */

DROP TABLE IF EXISTS `Wx_Button_Menu`;

CREATE TABLE `Wx_Button_Menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Button_Name` varchar(100) DEFAULT NULL COMMENT '按钮名称',
  `Title_Name` varchar(120) DEFAULT NULL COMMENT '菜单名称',
  `Type` varchar(50) DEFAULT NULL COMMENT '菜单响应动作类型，view标识网页，click表示点击类型miniprogram表示小程序类型',
  `ParentId` int(11) DEFAULT '0' COMMENT '父级id',
  `Is_Enable` tinyint(1) DEFAULT '0' COMMENT '是否启用默认启用',
  `Create_Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `Create_UserId` int(11) DEFAULT NULL COMMENT '创建人',
  `Update_Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `Update_UserId` int(11) DEFAULT NULL COMMENT '修改人',
  `OrgId` int(11) DEFAULT NULL COMMENT '机构id',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
