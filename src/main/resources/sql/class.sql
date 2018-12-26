/*
 Navicat Premium Data Transfer

 Source Server         : 47.106.169.223_3306
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 47.106.169.223:3306
 Source Schema         : lintiaodassm

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 26/12/2018 19:39:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '班级表id',
  `class_id` varchar(50) DEFAULT NULL COMMENT '班级id',
  `class_name` varchar(50) DEFAULT NULL COMMENT '班级名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='班级表';

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN;
INSERT INTO `class` VALUES (1, '1', '17软件3班');
INSERT INTO `class` VALUES (2, '2', '17软件4班');
INSERT INTO `class` VALUES (3, '3', '17软件5班');
INSERT INTO `class` VALUES (4, '4', '17大数据1班');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
