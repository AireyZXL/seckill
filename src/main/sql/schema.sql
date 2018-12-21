-- 数据库初始化脚本

-- 创建数据库
create database seckill;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
create table seckill(
  `seckill_id` bigint NOT NULL AUTO_INCREMENT COMMIT '商品库存id',
  `name` varchar(120) NOT NULL COMMIT '商品名称',
  `number` int NOT NULL COMMIT '库存数量',
  `start_time` timestamp NOT NULL COMMIT '秒杀开启时间',
  `end_time` timestamp NOT NULL COMMIT '秒杀结束时间',
  `create_time` timestamp NOT NULL COMMIT DEFAULT CURRENT_TIMESTAMP COMMIT '创建时间',
  primary key (seckill_id),
  key idx_start_time(start_time),
  key idx_end_time(end_time),
  key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMIT='秒杀库存表'；

-- 初始化数据
insert into seckill(name,number,start_time,end_time)
values
('1000元秒杀ipone6',100,'2018-11-11 00:00:00','2018-11-12 00:00:00'),
('500元秒杀ipad2',100,'2018-11-11 00:00:00','2018-11-12 00:00:00'),
('300元秒杀小米4',100,'2018-11-11 00:00:00','2018-11-12 00:00:00'),
('200元秒杀红米note',100,'2018-11-11 00:00:00','2018-11-12 00:00:00'),

-- 秒杀成功明细表
-- 用户登录认证相关的信息
create table success_killed(
 `seckill_id` bitint NOT NULL COMMIT '秒杀商品id',
 `user_phone` bitint NOT NULL COMMIT '用户手机号',
 `state` tinyint NOT NULL -1 COMMIT '状态标识：-1：无效，0:成功,1:已付款',
 `create_time` timestamp NOT NULL COMMIT '创建时间',
 primary key (seckill_id,user_phone), /*联合主键*/
 key idx_create_time (create_time)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMIT='秒杀成功明细表'