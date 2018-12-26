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

 Date: 26/12/2018 19:39:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student_class_course_teacher
-- ----------------------------
DROP TABLE IF EXISTS `student_class_course_teacher`;
CREATE TABLE `student_class_course_teacher` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '表的id',
  `student_id` varchar(50) DEFAULT NULL COMMENT '学号',
  `class_id` varchar(50) DEFAULT NULL COMMENT '班级id',
  `course_id` varchar(50) DEFAULT NULL COMMENT '课程id',
  `teacher_id` varchar(50) DEFAULT NULL COMMENT '教师id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_class_course_teacher
-- ----------------------------
BEGIN;
INSERT INTO `student_class_course_teacher` VALUES (2, '20170407430325', '1', '1', '1');
INSERT INTO `student_class_course_teacher` VALUES (3, '20170407430327', '1', '2', '2');
INSERT INTO `student_class_course_teacher` VALUES (4, '20170407430326', '3', '1', '2');
INSERT INTO `student_class_course_teacher` VALUES (5, '20170407430326', '3', '2', '1');
INSERT INTO `student_class_course_teacher` VALUES (6, '20170407430326', '3', '1', '3');
INSERT INTO `student_class_course_teacher` VALUES (7, '20170407430325', '1', '2', '2');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
