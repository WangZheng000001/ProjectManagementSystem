package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;
import com.seisoul.projectmanagementsystem.service.NameSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
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
    // 定义日期转换器
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping("/menbermission1")
    public String menbermission(@RequestParam("memName")String memname,
                                @RequestParam(name = "startTime", required = false)/*@DateTimeFormat(pattern = "yyyy-MM-dd")*/Date startTime,
                                @RequestParam(name = "endTime", required = false)/*@DateTimeFormat(pattern = "yyyy-MM-dd")*/Date endTime,
                                @RequestParam("level")Integer level,Model model){
        System.out.println(startTime);
        List<Mission> nameRecord = nameSelectService.projectAllByAnyWay(memname, startTime, endTime, level);
        model.addAttribute("nameRecord",nameRecord);
        return "namemissioninfo";
    }
}
