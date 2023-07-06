package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {
    Project selectByProjPassword(String projPassword);
    Project selectByFkMemId(int FkMemId);
}
