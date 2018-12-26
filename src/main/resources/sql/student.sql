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

 Date: 26/12/2018 19:39:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(60) NOT NULL AUTO_INCREMENT COMMENT '表的id',
  `student_id` varchar(50) DEFAULT NULL COMMENT '学号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `major` varchar(255) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (8, '20170407430325', '刘常江', '男', '软件工程');
INSERT INTO `student` VALUES (9, '20170407430326', '林允儿', '女', '商务英语');
INSERT INTO `student` VALUES (12, '20170407430327', 'YoonaDa', '女', '软件');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
