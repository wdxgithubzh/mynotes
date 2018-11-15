--用户表
CREATE TABLE `user`(
    `user_id` VARCHAR(100) NOT NULL COMMENT '主键:用户ID',
    `user_name` VARCHAR(100) NOT NULL COMMENT '用户名',
    `user_password` VARCHAR(100) NOT NULL COMMENT '用户密码',
    `user_nickname` VARCHAR(100) DEFAULT NULL COMMENT '昵称',
    PRIMARY KEY (`user_id`) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记本表
CREATE TABLE `notebook`(
    `notebook_id` VARCHAR(100) NOT NULL COMMENT '主键:笔记本ID',
    `user_id` VARCHAR(100) DEFAULT NULL COMMENT '用户ID',
    `notebook_type_id` VARCHAR(100) DEFAULT NULL COMMENT '笔记本类型ID',
    `notebook_name` VARCHAR(500) DEFAULT NULL COMMENT '笔记本名',
    `notebook_createtime` timestamp NOT NULL DEFAULT '0000-00-00' ON UPDATE CURRENT_TIMESTAMP COMMENT '创建笔记本时间且可以随着其他字段的更改而自动记录最后被修改的时间',
    PRIMARY KEY (`notebook_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记本类型表
CREATE TABLE `notebook_type`(
    `notebook_type_id` VARCHAR(100) NOT NULL COMMENT '主键：笔记本类型ID',
    `notebook_type_code` VARCHAR(100) DEFAULT NULL COMMENT '笔记本类型码',
    `notebook_type_name` VARCHAR(500) DEFAULT NULL COMMENT '笔记本类型名',
    `notebook_type_description` TEXT COMMENT '笔记本类型描述',
    PRIMARY KEY (`notebook_type_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记表
CREATE TABLE `notes`(
    `notes_id` VARCHAR(100) NOT NULL COMMENT '主键:笔记ID',
    `notebook_id` VARCHAR(100) DEFAULT NULL COMMENT '笔记本ID',
    `user_id` VARCHAR(100) DEFAULT NULL COMMENT '用户名',
    `notes_status_id` VARCHAR(100) DEFAULT NULL COMMENT '笔记状态ID',
    `notes_type_id` VARCHAR(100) DEFAULT NULL COMMENT '笔记类型ID',
    `notes_title` VARCHAR(500) DEFAULT NULL COMMENT '笔记标题',
    `notes_content` TEXT COMMENT '笔记内容',
    `notes_createtime` Date DEFAULT NULL COMMENT '创建时间',
    `notes_last_modifytime` Date DEFAULT NULL COMMENT '最后一次修改时间',
    PRIMARY KEY (`notes_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记状态表
CREATE TABLE `notes_status`(
    `notes_status_id` VARCHAR(100) NOT NULL COMMENT '主键：笔记状态ID',
    `notes_status_code` VARCHAR(100) DEFAULT NULL COMMENT '笔记状态码',
    `notes_status_name` VARCHAR(500) DEFAULT NULL COMMENT '笔记状态名',
    PRIMARY KEY (`notes_status_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记类型表
CREATE TABLE `notes_type`(
    `notes_type_id` VARCHAR(100) NOT NULL COMMENT '主键：笔记类型ID',
    `notes_type_code` VARCHAR(100) DEFAULT NULL COMMENT '笔记类型码',
    `notes_type_name` VARCHAR(100) DEFAULT NULL COMMENT '笔记类型名',
    `notes_type_description` TEXT COMMENT '笔记类型描述',
    PRIMARY KEY (`notes_type_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记分享表
CREATE TABLE `notes_share`(
    `notes_share_id` VARCHAR(100) NOT NULL COMMENT '主键：笔记分享ID',
    `notes_id` VARCHAR(100) DEFAULT NULL COMMENT '笔记ID',
    `notes_share_title` VARCHAR(500) DEFAULT NULL COMMENT '分享的笔记的标题',
    `notes_share_content` TEXT COMMENT '分享的笔记的内容',
    PRIMARY KEY (`notes_share_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8