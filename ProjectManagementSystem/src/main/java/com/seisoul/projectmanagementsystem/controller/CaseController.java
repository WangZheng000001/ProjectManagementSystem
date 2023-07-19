package com.seisoul.projectmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaseController {
    @RequestMapping("/ ")
    public String caseControl(){return "";}
}
