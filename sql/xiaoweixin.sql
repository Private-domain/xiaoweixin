/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.14 : Database - xiaoweixin
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xiaoweixin` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `t_dict` */

DROP TABLE IF EXISTS `t_dict`;

CREATE TABLE `t_dict` (
  `no` varchar(100) NOT NULL COMMENT '主键',
  `dict_name` varchar(100) DEFAULT NULL COMMENT '字典名字',
  `order_no` int(11) DEFAULT NULL COMMENT '排序',
  `description` varchar(500) DEFAULT NULL COMMENT '修改时间',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典表';

/*Data for the table `t_dict` */

/*Table structure for table `t_dict_data` */

DROP TABLE IF EXISTS `t_dict_data`;

CREATE TABLE `t_dict_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dict_no` varchar(100) DEFAULT NULL COMMENT '数据类别ID',
  `dictdata_value` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `dictdata_name` varchar(100) DEFAULT NULL COMMENT '创建时间',
  `is_fixed` int(11) DEFAULT NULL COMMENT '是否可读',
  `order_no` int(11) DEFAULT NULL COMMENT '排序',
  `description` varchar(500) DEFAULT NULL COMMENT '修改时间',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典表';

/*Data for the table `t_dict_data` */

/*Table structure for table `t_friend` */

DROP TABLE IF EXISTS `t_friend`;

CREATE TABLE `t_friend` (
  `no` varchar(255) NOT NULL,
  `user_no` varchar(255) DEFAULT NULL,
  `friend_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_friend` */

/*Table structure for table `t_menu` */

DROP TABLE IF EXISTS `t_menu`;

CREATE TABLE `t_menu` (
  `no` varchar(100) NOT NULL COMMENT '主键',
  `menu_name` varchar(100) DEFAULT NULL COMMENT '菜单名',
  `p_menu_code` varchar(100) DEFAULT NULL COMMENT '父级菜单ID',
  `level` int(11) DEFAULT NULL COMMENT '权重',
  `url` varchar(100) DEFAULT NULL COMMENT '菜单地址',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `is_menu` int(11) DEFAULT NULL COMMENT '是否菜单 1:菜单 0:模块',
  `order_no` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除 1:删除 0:未删',
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

/*Data for the table `t_menu` */

/*Table structure for table `t_org` */

DROP TABLE IF EXISTS `t_org`;

CREATE TABLE `t_org` (
  `no` varchar(100) NOT NULL COMMENT '机构ID',
  `p_org_code` varchar(100) DEFAULT NULL COMMENT '父级机构ID',
  `org_name` varchar(100) DEFAULT NULL COMMENT '机构名称',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `order_no` int(11) DEFAULT NULL COMMENT '排序',
  `decription` varchar(500) DEFAULT NULL COMMENT '描述',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织机构表';

/*Data for the table `t_org` */

/*Table structure for table `t_qr` */

DROP TABLE IF EXISTS `t_qr`;

CREATE TABLE `t_qr` (
  `no` varchar(255) NOT NULL,
  `qr_url` varchar(255) DEFAULT NULL,
  `qr_describe` varchar(255) DEFAULT NULL,
  `age_range` enum('18-23','24-29','30-35','36-41') DEFAULT NULL,
  `user_no` varchar(255) DEFAULT NULL,
  `disennable` enum('YES') DEFAULT NULL,
  `sex` enum('NAN','NV') DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_qr` */

/*Table structure for table `t_role` */

DROP TABLE IF EXISTS `t_role`;

CREATE TABLE `t_role` (
  `no` varchar(100) NOT NULL COMMENT '主键',
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `order_no` int(11) DEFAULT NULL COMMENT '排序',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `t_role` */

/*Table structure for table `t_role_level` */

DROP TABLE IF EXISTS `t_role_level`;

CREATE TABLE `t_role_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_no` varchar(100) DEFAULT NULL COMMENT '角色ID',
  `level` int(11) DEFAULT NULL COMMENT '权重',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权重表';

/*Data for the table `t_role_level` */

/*Table structure for table `t_role_menu` */

DROP TABLE IF EXISTS `t_role_menu`;

CREATE TABLE `t_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_no` varchar(100) DEFAULT NULL COMMENT '角色ID',
  `menu_no` varchar(100) DEFAULT NULL COMMENT '菜单ID',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单表';

/*Data for the table `t_role_menu` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `no` varchar(100) NOT NULL COMMENT '用户编号',
  `username` varchar(100) DEFAULT NULL COMMENT '登录名',
  `password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  `org_code` varchar(100) DEFAULT NULL COMMENT '机构ID',
  `name` varchar(100) DEFAULT NULL COMMENT '昵称',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `birthday` varchar(8) DEFAULT NULL COMMENT '出生日期',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  `img_url` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `phone_hide` enum('YES','NO') DEFAULT NULL,
  `weixin_code` varchar(255) DEFAULT NULL,
  `weixin_code_hide` enum('YES','NO') DEFAULT NULL,
  `img_url_hide` enum('YES','NO') DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `t_user` */

/*Table structure for table `t_user_role` */

DROP TABLE IF EXISTS `t_user_role`;

CREATE TABLE `t_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_no` varchar(100) DEFAULT NULL COMMENT '用户ID',
  `role_no` varchar(100) DEFAULT NULL COMMENT '角色ID',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `modify_time` date DEFAULT NULL COMMENT '修改时间',
  `is_del` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `t_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
