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
}
