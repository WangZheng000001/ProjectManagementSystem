package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MissionController {
    @Autowired
    private MissionService missionService;
    @GetMapping("/api/missions")
    public List<Mission> selectAllMission(){return missionService.selectAllMission();}

    @GetMapping("/api/missions/{desc}")
    public Mission getMissionByDesc(@PathVariable String desc) {
        return missionService.getMissionByDesc(desc);
    }
}
