package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    Project selectByProjPassword(String projPassword);

    //方法名:查询所有项目 返回值:Project对象的集合 方法形参:无
    List<Project> selectAllProject();

    //方法名:通过成员id查询项目 返回值:Project对象的集合 方法形参:int fkMemId(成员id)
    List<Project> selectByFkMemId(int fkMemId);

    //方法名:通过成员id查询项目 返回值:Project对象的集合 方法形参:Project对象
    List<Project> selectByFkMemId(Project project);

    //方法名:通过项目id查询项目 返回值:单个Project对象 方法形参:Project对象
    Project selectByProjId(Project project);

    //方法名:通过项目密匙查询项目 返回值:单个Project对象 方法形参:Project对象
    Project selectByProjPassword(Project project);

    //方法名:通过项目名称查询项目 返回值:Project对象的集合 方法形参:String类型 projName
    List<Project> selectByProjName(String projName);

    //方法名:通过项目状态查询项目 返回值:Project对象的集合 方法形参:Project对象
    List<Project> selectByProjStatus(Project project);
}
