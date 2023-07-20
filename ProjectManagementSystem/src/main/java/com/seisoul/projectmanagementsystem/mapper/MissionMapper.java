package com.seisoul.projectmanagementsystem.mapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
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
    
    //方法名：通过成员ID，开始时间，结束时间，以及项目状态 动态查询
    List<Mission>selectByAnyWay(Mission mission);
    //方法名：通过散装参数动态查询
    List<Mission>selectByAnyWay(Integer FkMemId, Date startTime,Date endTime,Integer level);

    Mission getMissionByDesc(@Param("desc") String desc);

}
