package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {
    Project selectByProjPassword(String projPassword);

    //查询所有项目
    Project selectAllProject();

    //通过成员id查询项目
    //Project selectByMemId(Member member);

    //通过项目id查询项目
    //Project selectByProjId(Project project);

    //通过项目名称查询项目
    //Project selectByProjName(Project project);

    //通过项目状态查找项目
    //Project selectByProjStatus(Project project);
}
