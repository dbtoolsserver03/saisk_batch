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

create table `ballteam` (
`ID` VARCHAR(5) not null COMMENT 'ID',
`SEI` VARCHAR(20) not null COMMENT '姓',
`MEI` VARCHAR(20) not null COMMENT '名',
`SEX` CHAR(2) null COMMENT '性別',
`BIRTHDAY` DATE null COMMENT '誕生日',
`SALARY` DECIMAL(10,1) null COMMENT '工资',
`PHOTO` BLOB null COMMENT '照片',
`CREATE_USER` VARCHAR(5) not null COMMENT '作成者',
`CREATE_TIME` DATETIME not null COMMENT '作成时间',
`UPDATE_USER` VARCHAR(10) not null COMMENT '更新者',
`UPDATE_TIME` DATETIME not null COMMENT '更新时间',
`DEL_FLG` VARCHAR(10) not null COMMENT '削除フラグ',
PRIMARY KEY (`ID`)) COMMENT='球队テーブル';
create table `teacher_table` (
`teacher_id` VARCHAR(10) not null COMMENT '先生ID',
`teacher_name` VARCHAR(32) not null COMMENT '先生姓名',
`teacher_sex` CHAR(1) not null COMMENT '性別',
`teacher_age` DATE not null COMMENT '生日',
PRIMARY KEY (`teacher_id`)) COMMENT='先生テーブル';
create table `t_animal` (
`ID` VARCHAR(5) not null COMMENT 'ID',
`SEI` VARCHAR(20) not null COMMENT '姓',
`MEI` VARCHAR(20) not null COMMENT '名',
`SEX` CHAR(1) null COMMENT '性別',
`BIRTHDAY` DATE null COMMENT '誕生日',
`FOOD` DECIMAL(10,1) null COMMENT 'FOOD',
`CREATE_TIME` DATETIME not null DEFAULT CURRENT_TIMESTAMP COMMENT '作成时间',
`UPDATE_USER` VARCHAR(10) not null DEFAULT 'ID000' COMMENT '更新者',
`UPDATE_TIME` DATETIME not null DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`DEL_FLG` CHAR(1) not null DEFAULT 0 COMMENT '削除フラグ',
PRIMARY KEY (`ID`)) COMMENT='動物テーブル';
create table `t_carinfo` (
`car_id` varchar(10) not null comment 'ID',
`car_maker` varchar(20) not null comment 'メーカー',
`car_type` varchar(20) not null comment 'タイプ',
`car_price` varchar(100) not null comment '価格',
`car_mileage` varchar(100) not null comment '走行距離',
`car_repair` char(1) not null comment '修復歴',
`car_displacement` varchar(20) not null comment '排気量',
primary key (`car_id`)) comment='車データ';
CREATE TABLE `JLEAGUE` ( 
    `ID` INT NOT NULL COMMENT '番号'
    , `SEI` VARCHAR (20) NOT NULL COMMENT '姓'
    , `NA` VARCHAR (20) DEFAULT NULL COMMENT '名'
    , `BRITH` DATETIME NOT NULL COMMENT '生年月日'
    , `TEAM` VARCHAR (20) DEFAULT NULL COMMENT '所属チーム'
    , `TELNUMBER` VARCHAR (20) DEFAULT NULL COMMENT '携帯番号'
    , `ADDRESS` VARCHAR (60) DEFAULT NULL COMMENT 'ADDRESS'
    , `PLACE_OF_BIRTH` VARCHAR (60) DEFAULT NULL COMMENT '出身地'
    , `SALARY` CHAR (1) DEFAULT NULL COMMENT '年収'
    , `JP_DEPUTY` CHAR (1) DEFAULT NULL COMMENT '日本代表'
    , `SKILL` VARCHAR (20) DEFAULT NULL COMMENT 'スキル'
    , `POSITION` VARCHAR (20) DEFAULT NULL COMMENT 'ポジション'
    , `RCL` VARCHAR (20) DEFAULT NULL COMMENT '位置'
    , PRIMARY KEY (`ID`)
) ENGINE = INNODB ;

create table `CUSTOMERS` (
`id` varchar(10) not null comment 'ID',
`AGE` varchar(20) not null comment 'AGE',
`ADDRESS` varchar(20) not null comment 'ADDRESS',
`SALARY` varchar(100) not null comment 'SALARY',
primary key (`id`)
);
CREATE TABLE `cat_table` (
  `cat_id` varchar(10) NOT NULL COMMENT 'CAT_ID',
  `cat_name` varchar(32) NOT NULL COMMENT 'CAT名',
  `cat_sex` char(1) NOT NULL COMMENT '性別',
  `cat_age` date NOT NULL COMMENT '生日',
  `cat_weight` decimal(10,0) DEFAULT 0 COMMENT 'KG',
  PRIMARY KEY (`cat_id`)
) COMMENT='CATテーブル';

CREATE TABLE `kyarakuta_table` (
  `kyarakuta_id` varchar(10) NOT NULL COMMENT 'kyarakutaID',
  `kyarakuta_name` varchar(32) NOT NULL COMMENT 'kyarakutaNAME',
  `kyarakuta_sex` char(1) NOT NULL COMMENT 'SEX',
  `kyarakuta_age` date NOT NULL COMMENT 'birthday',
  `kyarakuta_salary` decimal(10,0) DEFAULT 0 COMMENT 'money',
  PRIMARY KEY (`kyarakuta_id`)
) ENGINE=InnoDB  COMMENT='akunayitu';
CREATE TABLE `Person_table` (
  `person_id` varchar(10) NOT NULL COMMENT 'ID',
  `person_name` varchar(32) NOT NULL COMMENT '姓名',
  `person_sex` char(1) NOT NULL COMMENT '性別',
  `person_age` date NOT NULL COMMENT '生日',
  `person_salary` decimal(10,0) DEFAULT 0 COMMENT '月給',
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB  COMMENT='パーソンテーブル';

CREATE TABLE `card_table` (
  `card_id` varchar(10) NOT NULL COMMENT 'カードID',
  `card_name` varchar(32) NOT NULL COMMENT 'カード名',
  `card_zhongzu` char(5) NOT NULL COMMENT '种族',
  `card_shuxing` date NOT NULL COMMENT '属性',
  `card_attack` decimal(5,0) DEFAULT 0 COMMENT '攻击力',
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB  COMMENT='カードテーブル';



