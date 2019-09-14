-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `uid` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) DEFAULT NULL,
  `password` VARCHAR(255) DEFAULT NULL,
  `rolename` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES ('1', 'admin', 'admin', '超级管理员');
INSERT INTO `s_user` VALUES ('2', '习大大', '1234', '全球总理事');
INSERT INTO `s_user` VALUES ('3', '李大大', '1234', '亚洲总理事');
INSERT INTO `s_user` VALUES ('4', '卡梅隆', '1234', '欧洲总理事');
INSERT INTO `s_user` VALUES ('5', '奥巴马', '1234', '美洲总理事');
INSERT INTO `s_user` VALUES ('6', '陆克文', '1234', '大洋洲总理事');
INSERT INTO `s_user` VALUES ('7', '曼德拉', '1234', '非洲总理事');

-- ----------------------------
-- Table structure for s_cust
-- ----------------------------
DROP TABLE IF EXISTS `s_cust`;
CREATE TABLE `s_cust` (
  `cid` INT(11) NOT NULL AUTO_INCREMENT,
  `cust_name` VARCHAR(255) DEFAULT NULL,
  `cust_type` VARCHAR(255) DEFAULT NULL,
  `cust_phone` VARCHAR(255) DEFAULT NULL,
  `cust_address` VARCHAR(255) DEFAULT NULL,
  `cust_link_user` INT(11) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `FKC9A6CE9F5BAD9D3D` (`cust_link_user`),
  CONSTRAINT `FKC9A6CE9F5BAD9D3D` FOREIGN KEY (`cust_link_user`) REFERENCES `s_user` (`uid`)
) ENGINE=INNODB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_cust
-- ----------------------------
INSERT INTO `s_cust` VALUES ('1', '张三', '钻石会员', '13800138000', '北京朝阳区', '3');
INSERT INTO `s_cust` VALUES ('2', '李四', '黄金会员', '13900139000', '北京东城区', '4');
INSERT INTO `s_cust` VALUES ('3', '王五', '白金会员', '13300133000', '北京西城区', '5');
INSERT INTO `s_cust` VALUES ('4', '赵六', 'vip会员', '13400134000', '北京海淀区', '6');
INSERT INTO `s_cust` VALUES ('5', '田七', '普通用户', '13100131000', '北京昌平区', '7');


