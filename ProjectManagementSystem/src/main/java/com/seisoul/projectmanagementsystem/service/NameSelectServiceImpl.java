package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.mapper.MemberMapper;
import com.seisoul.projectmanagementsystem.mapper.MissionMapper;
import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.List;

@Service
public class NameSelectServiceImpl implements NameSelectService{
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private MissionMapper missionMapper;


     @Override
        public List<Mission> projectAllByName(String memName){
            Member member = memberMapper.selectByMemName(memName);
            Integer memId = member.getMemId();
            List<Mission> missions = missionMapper.selectByFkMemId(memId);
            return missions;
        }
    /*@Override
    public List<Mission> projectAllByAnyWay(String memName, Date startTime,Date endTime,Integer level){
        Mission mission = new Mission();
        Integer fKMemId = null;
        if(memName != null && memName != "") {
            Member member = memberMapper.selectByMemName(memName);
            fKMemId = member.getMemId();
            mission.setFkMemId(fKMemId);
            System.out.println(mission.getFkMemId());
        }else if(memName == "" || memName == null){
            mission.setFkMemId(null);
        }
        if(startTime != null) {
            mission.setStartTime(startTime);
        }
        if(endTime != null) {
            mission.setEndTime(endTime);
        }
        if(level != null) {
            mission.setLevel(level);
            System.out.println(mission);
        }
        List<Mission> missions = missionMapper.selectByAnyWay(mission);
        return missions;
    }*/

    @Override
    public List<Mission> projectAllByAnyWay(String memName, Date startTime,Date endTime,Integer level){
        Mission mission = new Mission();
        Integer fKMemId = null;
        if(memName.isEmpty()){
            mission.setFkMemId(-1);
        }else{
            Member member = memberMapper.selectByMemName(memName);
            fKMemId = member.getMemId();
            mission.setFkMemId(fKMemId);
            System.out.println(mission.getFkMemId());
        }
        String sTime = String.valueOf(startTime);
        String eTime = String.valueOf(endTime);
        if(sTime == null) {
            mission.setStartTime(null);
        }else {
            Date st = startTime;
            mission.setStartTime(st);
        }
        if(eTime == null) {
            mission.setEndTime(null);
        }else {
            Date et = endTime;
            mission.setEndTime(et);
        }
        mission.setLevel(level);
        System.out.println(mission);
        System.out.println(mission);

        List<Mission> missions = missionMapper.selectByAnyWay(mission);
        return missions;
    }
   /* @Override
    public List<Mission>projectAllByAnyWay(String memName, Date startTime, Date endTime, Integer lever){
        Member member = memberMapper.selectByMemName(memName);
        Integer fkMemId = member.getMemId();
        List<Mission> missions = missionMapper.selectByAnyWay(fkMemId, startTime, endTime, lever);
        System.out.println(missions);
        return missions;

    }*/

}
