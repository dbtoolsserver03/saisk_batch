create table `m_code` (
`code_div` varchar(20) not null comment 'コード区分',
`key` varchar(3) not null comment 'キー',
`val` varchar(256) null comment '値',
`delete_flg` char(1) not null comment '削除フラグ',
`create_time` datetime null comment '登録日時',
`create_user_id` varchar(20) null comment '登録者',
`update_time` datetime null comment '更新日時',
`update_user_id` varchar(20) null comment '更新者',
primary key (`code_div`,`key`)) comment='マスタ';
create table `t_item` (
`item_id` varchar(20) not null comment '商品id',
`item_name` varchar(32) not null comment '商品名',
`item_price` decimal(10,1) not null comment '商品価格',
`item_detail` varchar(200) null comment '商品紹介',
`item_pic` varchar(64) null comment '商品画像格納パス',
`item_product_date` datetime not null comment '生産日付',
`item_type` char(3) null comment '商品種別',
`delete_flg` char(1) not null comment '削除フラグ',
`create_time` datetime null comment '登録日時',
`create_user_id` varchar(20) null comment '登録者',
`update_time` datetime null comment '更新日時',
`update_user_id` varchar(20) null comment '更新者',
primary key (`item_id`)) comment='商品';
create table `t_order` (
`orders_no` char(20) not null comment '注文番号',
`user_id` varchar(20) not null comment 'ユーザid',
`createtime` datetime not null comment '注文作成日時',
`note` varchar(100) null comment 'コメント',
`delete_flg` char(1) not null comment '削除フラグ',
`create_time` datetime null comment '登録日時',
`create_user_id` varchar(20) null comment '登録者',
`update_time` datetime null comment '更新日時',
`update_user_id` varchar(20) null comment '更新者',
primary key (`orders_no`)) comment='注文';
create table `t_order_detail` (
`orders_no` char(20) not null comment '注文番号',
`sub_id` char(3) not null comment '子注文子id',
`item_id` varchar(20) not null comment '商品id',
`item_num` decimal(11) null comment '商品購入数量',
`delete_flg` char(1) not null comment '削除フラグ',
`create_time` datetime null comment '登録日時',
`create_user_id` varchar(20) null comment '登録者',
`update_time` datetime null comment '更新日時',
`update_user_id` varchar(20) null comment '更新者',
primary key (`orders_no`,`sub_id`)) comment='子注文';
create table `t_user` (
`id` varchar(20) not null comment 'ユーザid',
`username` varchar(32) not null comment 'ユーザ名（表示用）',
`birthday` datetime null comment '誕生日',
`sex` char(1) null comment '性別',
`address` varchar(256) null comment '住所',
`password` varchar(32) not null comment 'パスワード',
`tel` varchar(20) null comment '携帯',
`mail` varchar(100) null comment 'メール',
`delete_flg` char(1) not null comment '削除フラグ',
`create_time` datetime null comment '登録日時',
`create_user_id` varchar(20) null comment '登録者',
`update_time` datetime null comment '更新日時',
`update_user_id` varchar(20) null comment '更新者',
primary key (`id`)) comment='ユーザ';

create table `teacher_table` (
`teacher_id` VARCHAR(10) not null COMMENT '先生ID',
`teacher_name` VARCHAR(32) not null COMMENT '先生姓名',
`teacher_sex` CHAR(1) not null COMMENT '性別',
`teacher_age` DATE not null COMMENT '生日',
PRIMARY KEY (`teacher_id`)) COMMENT='先生テーブル';

CREATE TABLE `Blood_table` (
  `Person_id` varchar(10) NOT NULL COMMENT 'ID',
  `Person_name` varchar(10) NOT NULL COMMENT 'name',
  `Gender` char(2) NOT NULL COMMENT '性別',
  `age` date NOT NULL COMMENT '生日',
  `Blood_cc` decimal(10,0)  DEFAULT 200 COMMENT '献血量(CC)',
  PRIMARY KEY (`Person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='献血テーブル';

CREATE TABLE `book_table` (
  `book_id` varchar(10) NOT NULL COMMENT 'DOGID',
  `book_name` varchar(32) NOT NULL COMMENT 'book名',
  `book_type` char(1) NOT NULL COMMENT 'book类型',
  `book_age` date NOT NULL COMMENT 'book年份',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='book_table'
