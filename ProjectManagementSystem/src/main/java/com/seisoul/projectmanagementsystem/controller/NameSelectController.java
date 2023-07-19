package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import com.seisoul.projectmanagementsystem.service.NameSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class NameSelectController {
    @Autowired
  private NameSelectService nameSelectService;
    @RequestMapping("/menbermission")
    public String menbermission(@RequestParam("memName")String memName, Model model){
        List<Mission> nameRecord = nameSelectService.projectAllByName(memName);
        System.out.println(nameRecord.toString());
        model.addAttribute("nameRecord",nameRecord);
        return "namemissioninfo";
    }

    @RequestMapping("/menbermission1")
    public String menbermission(@RequestParam("memName")String memname,
                                @RequestParam("startTime")@DateTimeFormat(pattern = "yyyy-MM-dd")Date startTime,
                                @RequestParam("endTime")@DateTimeFormat(pattern = "yyyy-MM-dd")Date endTime,
                                @RequestParam("level")Integer level,Model model){
        List<Mission> nameRecord = nameSelectService.projectAllByAnyWay(memname, startTime, endTime, level);
        model.addAttribute("nameRecord",nameRecord);
        return "namemissioninfo";
    }
}
