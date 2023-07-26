package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    public List<Project> selectAllProject(){
        return projectMapper.selectAllProject();
    }

}
