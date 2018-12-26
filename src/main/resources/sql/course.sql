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

 Date: 26/12/2018 19:39:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '表的id',
  `course_id` varchar(50) DEFAULT NULL COMMENT '课程id',
  `course_name` varchar(50) DEFAULT NULL COMMENT '课程名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES (1, '1', 'Java');
INSERT INTO `course` VALUES (2, '2', 'Python');
INSERT INTO `course` VALUES (3, '3', 'C++');
INSERT INTO `course` VALUES (4, '4', 'IOS');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
