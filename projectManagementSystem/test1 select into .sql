-- 测试test
-- 为表格添加数据

use `db_project_management_system`;


BEGIN;
-- 为员工添加数据
INSERT INTO `tb_mem`(`password`,`mem_name`,`gender`,`leader`) 
VALUES 
('ABC123','たなが','0','0'),
('ABC456','王五','1','1'),
('ABC789','lisa','1','0');
SELECT * FROM `tb_mem`;

-- 为项目表添加数据
INSERT INTO `tb_proj`(`proj_name`,`add_time`,`end_time`,`proj_status`,`fk_mem_id`)
VALUES
('车辆管理系统','2023-07-03',null,'0',(SELECT `mem_id` FROM `tb_mem` WHERE `mem_name` = 'たなが')),
('美食管理系统','2023-06-01',null,'1',(SELECT `mem_id` FROM `tb_mem` WHERE `mem_name` = '王五')),
('项目管理系统','2023-07-03',null,'0',(SELECT `mem_id` FROM `tb_mem` WHERE `mem_name` = 'lisa'));
SELECT * FROM `tb_proj`;

-- 为任务表添加数据
INSERT INTO `tb_mis`(`desc`,`fk_proj_id`,`add_time`,`expire_time`,`mis_status`,`start_time`,`end_time`,`level`,`progress`,`fk_mem_id`)
VALUES 
('完成车辆管理系统',(SELECT `proj_id` FROM `tb_proj` WHERE `proj_name` = '车辆管理系统'),'2023-06-01','2024-12-01', 1 ,'2023-06-01', null, 1,1,(SELECT `mem_id` FROM `tb_mem` WHERE `mem_name` = 'たなが')),
('完成美食管理系统',(SELECT `proj_id` FROM `tb_proj` WHERE `proj_name` = '美食管理系统'),'2023-06-02','2024-12-02', 2 ,'2023-06-02', '2024-07-01',1,1,(SELECT `mem_id` FROM `tb_mem` WHERE `mem_name` = '王五'));
SELECT * FROM `tb_mis`;

-- ROLLBACK;
COMMIT;
