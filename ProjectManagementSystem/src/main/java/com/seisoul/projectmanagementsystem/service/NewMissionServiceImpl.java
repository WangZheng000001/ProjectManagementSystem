package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.mapper.MemberMapper;
import com.seisoul.projectmanagementsystem.mapper.MissionMapper;
import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewMissionServiceImpl implements NewMissionService{
    @Autowired
    MissionMapper missionMapper;
    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    MemberMapper memberMapper;
    @Override
    public int newMission(String projName, String memName,Mission mission){

        Project project = projectMapper.selectByProjNameProject(projName);
        int projId = project.getProjId();//get projID;
        mission.setFkProjId(projId);  //封装projId;
        Member member = memberMapper.selectByMemName(memName);
        int memId = member.getMemId();
        mission.setFkMemId(memId);
        System.out.println(mission);
        int i = missionMapper.newMission(mission);//i为改变行数。
        return i;
    }
}
