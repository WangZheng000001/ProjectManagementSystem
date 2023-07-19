package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.mapper.MissionMapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MissionController {
    @Autowired
    private MissionMapper missionMapper;
    @GetMapping("/api/missions")
    public List<Mission>selectAllMission(){return missionMapper.selectAllMission();}
}
