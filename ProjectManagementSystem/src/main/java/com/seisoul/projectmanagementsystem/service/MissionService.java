package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.mapper.MissionMapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MissionService {
    @Autowired
    private MissionMapper missionMapper;
    public List<Mission> selectAllMission(){
        return missionMapper.selectAllMission();
    }

    public Mission getMissionByDesc(String desc){
        return missionMapper.getMissionByDesc(desc);
    }

    public Mission addMission(Mission mission) {
        return missionMapper.addMission(mission);
    }

}
