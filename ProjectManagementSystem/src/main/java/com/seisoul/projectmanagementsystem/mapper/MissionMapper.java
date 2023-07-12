package com.seisoul.projectmanagementsystem.mapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MissionMapper {

    //方法名:查询所有任务 返回值:Mission对象的集合 方法形参:无
    List<Mission> selectAllMission();

    //方法名:通过任务id查询任务 返回值:单一的Mission对象 方法形参:Mission对象
    Mission selectByMisId(Mission mission);

    //方法名:通过项目id查询任务 返回值:Mission对象的集合 方法形参:Mission对象
    List<Mission> selectByFkProjId(Mission mission);

    //方法名:通过成员id查询任务 返回值:Mission对象的集合 方法形参:int类型 fkMemId
    List<Mission> selectByFkMemId(int fkMemId);

    //方法名:通过成员id查询任务 返回值:Mission对象的集合 方法形参:Mission对象
    List<Mission> selectByFkMemId(Mission mission);

    //方法名:通过时间和任务状态查询任务 返回值:Mission对象的集合 方法形参:Mission对象
    List<Mission> selectByAddTimeAndEndTimeAndMisStatus(Mission mission);

}
