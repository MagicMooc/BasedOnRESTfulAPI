/*
 Navicat Premium Data Transfer

 Source Server         : yoona
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 24/12/2018 21:05:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(60) NOT NULL COMMENT '学号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `major` varchar(255) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (5, '林夏想', '男', '软件');
INSERT INTO `student` VALUES (6, '林达', '女', '网络');
INSERT INTO `student` VALUES (24, '林条达', '男', '软件工程');
INSERT INTO `student` VALUES (551, '555', '33', '55');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
