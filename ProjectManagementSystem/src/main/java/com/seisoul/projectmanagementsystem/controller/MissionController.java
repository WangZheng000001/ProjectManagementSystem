package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
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
    public ResponseEntity<Mission> addMission(@ModelAttribute Mission mission) {
        printFieldsAndTypes(mission);
        int rowsInserted = missionService.addMission(mission);
        System.out.println("Mission after adding: " + mission);
        if (rowsInserted > 0) {
            return new ResponseEntity<>(mission, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private void printFieldsAndTypes(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println("Field name: " + field.getName() + ", Type: " + field.getType().getName() + ", Value: " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
