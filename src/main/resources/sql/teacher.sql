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

 Date: 26/12/2018 19:40:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '表的id',
  `teacher_id` varchar(50) DEFAULT NULL COMMENT '教师id',
  `teacher_name` varchar(50) DEFAULT NULL COMMENT '教师名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (1, '1', '蔡柳萍');
INSERT INTO `teacher` VALUES (2, '2', '原峰山');
INSERT INTO `teacher` VALUES (3, '3', '赵玉刚');
INSERT INTO `teacher` VALUES (4, '4', '哈哈');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
