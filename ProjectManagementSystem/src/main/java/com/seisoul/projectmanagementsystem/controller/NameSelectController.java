package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import com.seisoul.projectmanagementsystem.service.NameSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NameSelectController {
    @Autowired
    private NameSelectService nameSelectService;
    @RequestMapping("/menbermission")
    public String menbermission(@RequestParam("memName")String memName, Model model){
        System.out.println("memname是"+memName);
        List<Mission> nameRecord = nameSelectService.projectAllByName(memName);
        System.out.println(nameRecord.toString());
        model.addAttribute("nameRecord",nameRecord);
        return "namemissioninfo";
    }
}
