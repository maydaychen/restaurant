/*
MySQL Data Transfer
Source Host: localhost
Source Database: b_140327_food
Target Host: localhost
Target Database: b_140327_food
Date: 2015/9/5 18:57:05
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `screen_name` varchar(20) NOT NULL,
  `type` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for food_info
-- ----------------------------
CREATE TABLE `food_info` (
  `food_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(20) NOT NULL,
  `food_pic` varchar(200) NOT NULL,
  `food_description` varchar(500) NOT NULL,
  `food_price` float NOT NULL,
  `food_discount_price` float NOT NULL,
  `food_flag` varchar(200) NOT NULL,
  `food_count` varchar(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`food_id`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_id` int(11) NOT NULL,
  `seat` varchar(6) NOT NULL,
  `description` varchar(50) NOT NULL,
  `order_date` varchar(20) NOT NULL,
  `beizhu` varchar(200) NOT NULL,
  `price` varchar(6) NOT NULL,
  `state` varchar(5) NOT NULL DEFAULT '未结账',
  `go_alert` varchar(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for test_member
-- ----------------------------
CREATE TABLE `test_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `screen_name` varchar(20) NOT NULL,
  `sex` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for type
-- ----------------------------
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `content` varchar(50) NOT NULL,
  `state` varchar(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_tb
-- ----------------------------
CREATE TABLE `user_tb` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `user_userid` varchar(32) DEFAULT NULL,
  `user_username` varchar(16) DEFAULT NULL,
  `user_password` varchar(32) DEFAULT NULL,
  `user_phone` varchar(32) DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_grade` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', '管理员', '0');
INSERT INTO `admin` VALUES ('2', 'a', '1 ', 'aaaa ', '1');
INSERT INTO `admin` VALUES ('3', 'b', '1 ', '123aaa ', '0');
INSERT INTO `food_info` VALUES ('8', '红烧肉', 'pork.jpg', '红烧肉是目前人们餐桌上最常见的肉类食物之一，猪瘦肉中富含铁，容易被人体吸收，能预防贫血。猪肉味甘咸，性平，有补虚、滋阴、养血、润燥的功效。', '20', '10', '主菜', '22');
INSERT INTO `food_info` VALUES ('9', '德国黑啤', 'beer.jpg', '啤酒营养丰富，其中含有丰富的氨基酸，是原料大麦含有的蛋白质经过酶的作用分解而产生的。且啤酒中还含有多种维生素。适量饮啤酒有强心、利尿、健胃的功效。', '50', '40', '酒水', '3');
INSERT INTO `food_info` VALUES ('10', '牛排', 'beef.jpg', '牛排有补中益气，滋养脾胃，强健筋骨，化痰息风，止渴止涎之功效。牛肉富含蛋白质，而脂肪少，氨基酸组成比猪肉更接近人体需要，能提高机体抗病能力。', '100', '90', '主菜', '11');
INSERT INTO `food_info` VALUES ('11', '虾', 'shrimp.jpg', '虾营养极为丰富，含蛋白质是鱼、蛋、奶的几倍到几十倍；还含有丰富的钾、碘、镁、磷等矿物质及维生素A、氨茶碱等成分。', '80', '75', '海鲜', '5');
INSERT INTO `food_info` VALUES ('12', '大闸蟹', 'crab.jpg', '大闸蟹大闸蟹大闸蟹', '100', '80', '海鲜', '6');
INSERT INTO `food_info` VALUES ('13', '麻辣鸡块', '1361753218461.jpg', '麻辣鸡块麻辣鸡块', '100', '50', '主菜', '2');
INSERT INTO `food_info` VALUES ('14', '111111', '1.png', '11111', '12', '10', '酒水', '0');
INSERT INTO `orders` VALUES ('31', '2', '15', '大闸蟹,虾,', '2015-06-16 22:36:17', '123123123', '133', '已结账', '0');
INSERT INTO `orders` VALUES ('32', '8', '21', '大闸蟹,虾,', '2015-06-18 16:44:30', 'ktpwmj', '155.0', '已结账', '0');
INSERT INTO `orders` VALUES ('33', '10', '15', '大闸蟹--80.0 ,虾--75.0 ,', '2015-06-18 17:12:12', 'jgpt', '155.0', '已结账', '0');
INSERT INTO `orders` VALUES ('34', '12', '23', '虾--75.0 ,大闸蟹--80.0 ,虾--75.0 ,', '2015-06-18 17:16:12', 'jgt', '230.0', '已结账', '0');
INSERT INTO `orders` VALUES ('35', '15', '10', '麻辣鸡块--50.0 ,大闸蟹--80.0 ,虾--75.0 ,', '2015-06-18 21:44:36', 'ji-jtag', '205.0', '已结账', '0');
INSERT INTO `orders` VALUES ('38', '49', '1', '大闸蟹--80.0 ,虾--75.0 ,', '2015-06-02 12:41:09', '15968', '155.0', '已结账', '1');
INSERT INTO `orders` VALUES ('39', '52', 'a', '麻辣鸡块--50.0 ,德国黑啤--40.0 ,虾--75.0 ,', '2015-06-02 15:54:31', '0302', '165.0', '未结账', '1');
INSERT INTO `orders` VALUES ('40', '72', 'ad', '大闸蟹--80.0 ,德国黑啤--40.0 ,', '2015-06-01 20:40:42', '201404', '120.0', '已结账', '0');
INSERT INTO `orders` VALUES ('41', '4', '1', '虾--75.0 ,牛排--90.0 ,', '2015-09-05 17:26:28', '', '165.0', '未结账', '0');
INSERT INTO `orders` VALUES ('42', '6', '1', '111111--10.0 ,', '2015-09-05 18:54:59', '', '10.0', '未结账', '0');
INSERT INTO `type` VALUES ('32', '主菜', '主菜主菜主菜主菜', '未开桌');
INSERT INTO `type` VALUES ('33', '凉菜', '凉菜凉菜凉菜', '开桌');
INSERT INTO `type` VALUES ('34', '海鲜', '海鲜海鲜海鲜  ', '开桌');
INSERT INTO `type` VALUES ('35', '点心', '点心点心点心', '开桌');
INSERT INTO `type` VALUES ('36', '酒水', '酒水酒水酒水酒水', '未开桌');
INSERT INTO `user_tb` VALUES ('1', '1', '1', '1', '1', '1', '0');
INSERT INTO `user_tb` VALUES ('2', 'b', 'b', 'b', 'b', 'b', '0');
INSERT INTO `user_tb` VALUES ('3', 'a', 'abc', 'b', 'a', 'a', '0');
INSERT INTO `user_tb` VALUES ('4', 'aaa', 'aaabbb', 'a', '1399991000', 'zhongguo', '0');
INSERT INTO `user_tb` VALUES ('5', 'ad', '123', '1', '258', '1234', '0');
INSERT INTO `user_tb` VALUES ('6', 'm', 'ajtpg', '1', '12569889554', '1423658', '0');
