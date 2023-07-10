package com.seisoul.projectmanagementsystem.mapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MissionMapper {

    //查询所有任务
    Mission SelectAllMission();
    List<Mission> selectByFkMemId(int fkMemId);


}
