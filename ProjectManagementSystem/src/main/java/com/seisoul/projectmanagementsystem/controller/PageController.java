package com.seisoul.projectmanagementsystem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/missioninfo")
    public String missioninfo() {
        return "missioninfo";
    }

    @GetMapping("missionmgmt")
    public String missionMgmt() {
        return "missionmgmt";
    }

    @GetMapping("allmgmt")
    public String allMgmt(){
        return "allmgmt";
    }
}
