package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/api/missions/add")
    public ResponseEntity<Mission> addMission(@RequestBody Mission mission) {
        try {
            Mission addedMission = missionService.addMission(mission);
            return new ResponseEntity<>(addedMission, HttpStatus.CREATED);
        } catch (Exception e) {
            System.err.println("Failed to add mission: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
