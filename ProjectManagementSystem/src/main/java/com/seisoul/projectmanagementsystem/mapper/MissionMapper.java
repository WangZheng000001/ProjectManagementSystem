package com.seisoul.projectmanagementsystem.mapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MissionMapper {

    //查询所有任务
    Mission SelectAllMission();

}
