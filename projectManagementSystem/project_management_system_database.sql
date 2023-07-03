DROP DATABASE IF EXISTS `db_project_management_system`;
CREATE DATABASE IF NOT EXISTS `db_project_management_system`;
USE `db_project_management_system`;


-- 创建员工表
CREATE TABLE `tb_mem`(
`mem_id` INT PRIMARY KEY AUTO_INCREMENT,		-- id
`password` VARCHAR(20) NOT NULL,				-- 密码
`mem_name` VARCHAR(5) NOT NULL,					-- 名称
`gender` INT NOT NULL,							-- 性别 0:男 1:女
`leader` INT NOT NULL							-- 是否是组长 0:否 1:是
);

-- 创建项目表
CREATE TABLE `tb_proj`(
`proj_id` INT PRIMARY KEY AUTO_INCREMENT,		-- 项目id
`proj_name` VARCHAR(32) NOT NULL UNIQUE,	-- 项目名称
`add_time` DATE NOT NULL,		-- 项目创建时间
`end_time` DATE ,	-- 结束时间
`proj_status` INT NOT NULL,		-- 项目状态 0:未完成 1:处理中 2:处理完
`fk_mem_id` INT ,	-- 任务负责人(外键)
CONSTRAINT `fk_projToMem_mem_id` FOREIGN KEY (`fk_mem_id`) REFERENCES `tb_mem`(`mem_id`)
);

-- 创建任务表
CREATE TABLE `tb_mis`(
`mis_id` INT PRIMARY KEY AUTO_INCREMENT,		-- 任务id
`desc` VARCHAR(32) NOT NULL,	-- 任务内容
`fk_proj_id` INT NOT NULL,		-- 对应的项目(外键)
`add_time` DATE NOT NULL,	-- 任务发布时间
`expire_time` DATE ,		-- 任务给定时间/締切
`mis_status`INT NOT NULL,				-- 任务处理状态	0:未处理/待处理 1:处理中 2:处理完成
`start_time` DATE ,			-- 任务着手时间
`end_time` DATE ,			-- 结束时间
`level` INT NOT NULL,		-- 任务优先级
`progress` INT NOT NULL,	-- 任务进展
`fk_mem_id` INT NOT NULL,	-- 任务负责人(外键)
CONSTRAINT `fk_misToProj_proj_id` FOREIGN KEY (`fk_proj_id`) REFERENCES `tb_proj`(`proj_id`),
CONSTRAINT `fk_misToMem_mem_id` FOREIGN KEY (`fk_mem_id`) REFERENCES `tb_mem`(`mem_id`)
);

SHOW DATABASES;
SHOW TABLES FROM `db_project_management_system`;
DESC `tb_mem`;
DESC `tb_proj`;
DESC `tb_mis`;