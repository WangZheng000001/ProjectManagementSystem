package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectMapper projectMapper;
    @GetMapping("/api/projects")
    public List<Project> selectAllMission(){return projectMapper.selectAllProject();}
}
