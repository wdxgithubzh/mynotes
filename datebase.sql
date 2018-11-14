--用户表
CREATE TABLE `user`(
    `user_id` VARCHAR(100) NOT NULL COMMENT '主键:用户ID',
    `user_name` VARCHAR(100) NOT NULL COMMENT '用户名',
    `user_password` VARCHAR(100) NOT NULL COMMENT '用户密码',
    PRIMARY KEY (`user_id`) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记本表
CREATE TABLE `notebook`(
    `notebook_id` VARCHAR(100) NOT NULL COMMENT '主键:笔记本ID',
    `user_id` VARCHAR(100) NOT NULL COMMENT '用户ID',
    `notebook_name` VARCHAR(500) NOT NULL COMMENT '笔记本名',
    PRIMARY KEY (`notebook_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--笔记表
CREATE TABLE `notes`(
    `notes_id` VARCHAR(100) NOT NULL COMMENT '主键:笔记ID',
    `notebook_id` VARCHAR(100) NOT NULL COMMENT '笔记本ID',
    `user_id` VARCHAR(100) NOT NULL COMMENT '用户名',
    `notes_title` VARCHAR(500) NOT NULL COMMENT '笔记标题',
    `notes_content` TEXT COMMENT '笔记内容',
    `notes_createtime` Date NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`notes_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8