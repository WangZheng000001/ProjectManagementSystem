package com.seisoul.projectmanagementsystem.controller;
import com.seisoul.projectmanagementsystem.mapper.MissionMapper;
import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.service.NewMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Controller
public class NewMissionController {
    @Autowired
    NewMissionService newMissionService;
    @Autowired
    MissionMapper missionMapper;

    @RequestMapping("/addCase")
    public String showAddCaseForm() {
        return "makenewmission"; // 返回表单页面的视图名
    }
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping("/makenewmission")
    public String newMission(String projName,String memName,@ModelAttribute Mission mission, Model model){
        int i = newMissionService.newMission(projName, memName, mission);//调用增加数据方法，得到改变行数；
        model.addAttribute("i",i);
        return "membermission";
    }
}
