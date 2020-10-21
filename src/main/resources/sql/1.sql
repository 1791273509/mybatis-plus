/*
SQLyog Ultimate v8.32 
MySQL - 5.5.36 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user` (
	`id` double ,
	`name` varchar (90),
	`age` double ,
	`email` varchar (150),
	`manager_id` double ,
	`create_time` datetime 
); 
insert into `user` (`id`, `name`, `age`, `email`, `manager_id`, `create_time`) values('1087982257332887553','大boss','40','boss@baomidou.com',NULL,'2019-01-11 14:20:20');
insert into `user` (`id`, `name`, `age`, `email`, `manager_id`, `create_time`) values('1088248166370832385','王天风','25','wtf@baomidou.com','1087982257332887553','2019-02-05 11:12:22');
insert into `user` (`id`, `name`, `age`, `email`, `manager_id`, `create_time`) values('1088250446457389058','李艺伟','28','lyw@baomidou.com','1088248166370832385','2019-02-14 08:31:16');
insert into `user` (`id`, `name`, `age`, `email`, `manager_id`, `create_time`) values('1094590409767661570','张雨琪','31','zjq@baomidou.com','1088248166370832385','2019-01-14 09:15:15');
insert into `user` (`id`, `name`, `age`, `email`, `manager_id`, `create_time`) values('1094592041087729666','刘红雨','32','lhm@baomidou.com','1088248166370832385','2019-01-14 09:48:16');
