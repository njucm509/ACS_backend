/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : dc

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-03-07 10:12:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attribue
-- ----------------------------
DROP TABLE IF EXISTS `attribue`;
CREATE TABLE `attribue` (
  `attribute_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `attribute_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of attribue
-- ----------------------------
INSERT INTO `attribue` VALUES ('1', 'name、sex、birthday、hospital、department、attending_doctor、medical_insurance、date_of_consultation、visiting_status、complaints、seriousness、medical_history、treatment_effect、speciality_check_up、drug_use、release_time');
INSERT INTO `attribue` VALUES ('2', 'hospital、department、attending_doctor、visiting_status、complaints、seriousness、medical_history、treatment_effect、speciality_check_up、drug_use、release_time');
INSERT INTO `attribue` VALUES ('3', 'visiting_status、complaints、seriousness、medical_history、treatment_effect、speciality_check_up、release_time');
INSERT INTO `attribue` VALUES ('4', 'NULL');

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `content` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('1', 'auth_upload,auth_select_country');
INSERT INTO `authority` VALUES ('2', 'audit_authority');
INSERT INTO `authority` VALUES ('3', 'auth_download,auth_select_country');
INSERT INTO `authority` VALUES ('4', 'auth_upload,auth_download,auth_add,auth_delete,auth_update,auth_select_self');
INSERT INTO `authority` VALUES ('5', 'auth_download,auth_delete,auth_select_department');
INSERT INTO `authority` VALUES ('6', 'auth_download,auth_delete,auth_select_company');
INSERT INTO `authority` VALUES ('7', 'auth_download,auth_delete,auth_select_district');
INSERT INTO `authority` VALUES ('8', 'auth_download,auth_delete,auth_select_province');
INSERT INTO `authority` VALUES ('9', 'auth_download,auth_delete,auth_select_country');

-- ----------------------------
-- Table structure for dataset
-- ----------------------------
DROP TABLE IF EXISTS `dataset`;
CREATE TABLE `dataset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `birthday` date NOT NULL,
  `hospital` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `department` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `attending_doctor` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `medical_insurance` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `date_of_consultation` date NOT NULL,
  `visiting_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `complaints` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `seriousness` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `medical_history` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `treatment_effect` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `speciality_check_up` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `drug_use` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `release_time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dataset
-- ----------------------------
INSERT INTO `dataset` VALUES ('139', '佚名', '男', '2012-10-30', '江苏省南京市栖霞区医院1', '部门1', '主治医生1', '甲类', '2014-02-17', '初诊', '咳嗽，气喘月余', '中', '患儿目前发热后出现咳嗽，气喘，予抗感染，化痰止咳平，喘后不缓解。患儿目前咳嗽不剧，白天偶有咳嗽，夜间不作，喉中有痰，不会咯吐，近半月气喘明显，目前动后气喘尤显，平素易感冒，咳嗽', 'NULL', '纳尚可，寐欠安，易哭闹，二便调。患儿出生至今患“贫血”“单肾”', '杏仁、炙麻黄、辛夷、前胡', '2020-01-03');
INSERT INTO `dataset` VALUES ('140', '佚名', '男', '2006-07-11', '江苏省苏州市吴中区医院2', '部门1', '主治医生2', '乙类', '2015-07-16', '复诊', '服上药后患儿现揉鼻较前减少，现双眼睫膜仍有充血，未有胃痛，HP未查。无鼻塞流涕咳嗽', '轻', 'NULL', '较差', '纳寐可，二便调，汗可家长欲续调理。喉间有痰，平素易疲乏。', '葶苏子、胆南星、黄苓', '2020-01-03');
INSERT INTO `dataset` VALUES ('148', '佚名', '男', '2014-09-03', '江苏省南京市鼓楼区医院1', '部门2', '主治医生1', '甲类', '2015-06-04', '复诊', '患儿自上次来诊之后，晨起喉间可闻及哮鸣音，稍活动后即自行缓解', '轻', 'NULL', '较好', '纳寐可，精神佳，无发热，无咳嗽，大便可，日一次，小便可，一般情况可，患儿一般情况可，近期精神好，饮食二便调，喉中喘鸣', '炙黄芪、白术、防风、煅龙牡', '2020-01-03');
INSERT INTO `dataset` VALUES ('149', '佚名', '男', '2020-01-03', '江苏省泰州市姜堰区医院1', '部门4', '主治医生2', '甲类', '2013-08-29', '复诊', '患儿右侧口角溃疡疼痛，5月中，昨夜生气面部出现红疹，瘙痒', '中', '右侧口角溃疡7天，面部红疹1天', '中', '胃纳欠佳，人工奶粉喂养，一日饮奶300-400ml，脾气暴躁，好动，睡眠欠佳，晚上23:00到24:00间易醒，翻身，大便一日一次，大便成形，小便可，口气重', '生甘草、地肤子、川连', '2019-12-19');
INSERT INTO `dataset` VALUES ('153', '佚名', '男', '2003-09-01', '安徽省马鞍山市雨山区医院3', '部门4', '主治医生4', '乙类', '2015-05-02', '初诊', '无外感症状，晨起流清涕，喷嚏频繁，平素怕冷，四肢易凉，现每日固定睡前服用孟鲁司特1粒，已持续近2个月', '中', '患儿于2009年确诊过敏性哮喘，经查对尘螨过敏，近一次2015年4月5日受凉后作喘，经输液及服用咳喘宁3天后好转', 'NULL', '纳食较前好，但仍偏少，挑食喜荤，汗出已运动及初寐时甚，大便日行一次，小便稍黄，欲调理', '白术、防风、川桂枝', '2019-07-01');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '科研部门(数请求者)');
INSERT INTO `role` VALUES ('10', '系统管理员');
INSERT INTO `role` VALUES ('2', '防疫部门(数据请求者)');
INSERT INTO `role` VALUES ('3', '数据提供者');
INSERT INTO `role` VALUES ('4', '科室监管');
INSERT INTO `role` VALUES ('5', '院监管');
INSERT INTO `role` VALUES ('6', '区监管');
INSERT INTO `role` VALUES ('7', '市监管');
INSERT INTO `role` VALUES ('8', '省监管');
INSERT INTO `role` VALUES ('9', '国家监管');

-- ----------------------------
-- Table structure for role_attribute
-- ----------------------------
DROP TABLE IF EXISTS `role_attribute`;
CREATE TABLE `role_attribute` (
  `role_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `attribute_id` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role_attribute
-- ----------------------------
INSERT INTO `role_attribute` VALUES ('1', '2');
INSERT INTO `role_attribute` VALUES ('2', '4');
INSERT INTO `role_attribute` VALUES ('3', '3');
INSERT INTO `role_attribute` VALUES ('4', '1');
INSERT INTO `role_attribute` VALUES ('5', '1');
INSERT INTO `role_attribute` VALUES ('6', '1');
INSERT INTO `role_attribute` VALUES ('7', '1');
INSERT INTO `role_attribute` VALUES ('8', '1');
INSERT INTO `role_attribute` VALUES ('9', '1');

-- ----------------------------
-- Table structure for role_authority
-- ----------------------------
DROP TABLE IF EXISTS `role_authority`;
CREATE TABLE `role_authority` (
  `role_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `auth_id` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role_authority
-- ----------------------------
INSERT INTO `role_authority` VALUES ('1', '1');
INSERT INTO `role_authority` VALUES ('2', '2');
INSERT INTO `role_authority` VALUES ('3', '3');
INSERT INTO `role_authority` VALUES ('4', '4');
INSERT INTO `role_authority` VALUES ('5', '5');
INSERT INTO `role_authority` VALUES ('6', '6');
INSERT INTO `role_authority` VALUES ('7', '7');
INSERT INTO `role_authority` VALUES ('8', '8');
INSERT INTO `role_authority` VALUES ('9', '9');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_company` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root1', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');
INSERT INTO `user` VALUES ('10', 'root10', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('11', 'root11', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');
INSERT INTO `user` VALUES ('12', 'root12', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('2', 'root2', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('3', 'root3', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');
INSERT INTO `user` VALUES ('4', 'root4', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('5', 'root5', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');
INSERT INTO `user` VALUES ('6', 'root6', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('7', 'root7', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');
INSERT INTO `user` VALUES ('8', 'root8', 'admin', '10.10.100.12', '部门2', '研发部门', '停用');
INSERT INTO `user` VALUES ('9', 'root9', 'admin', '10.120.34.215', '部门1', '检疫部门', '正常');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('2', '2');
