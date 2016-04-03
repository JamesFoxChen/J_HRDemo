/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : hr

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-04-03 15:15:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for operatelog
-- ----------------------------
DROP TABLE IF EXISTS `operatelog`;
CREATE TABLE `operatelog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operatelog
-- ----------------------------
INSERT INTO `operatelog` VALUES ('1', '1', '2016-04-03 12:58:30', '1');
INSERT INTO `operatelog` VALUES ('2', '2', '2016-04-04 12:58:37', '1');
