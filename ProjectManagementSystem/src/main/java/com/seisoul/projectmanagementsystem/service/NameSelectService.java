package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.pojo.Mission;
import com.seisoul.projectmanagementsystem.pojo.Project;

import java.util.Date;
import java.util.List;

public interface NameSelectService {
    List<Mission> projectAllByName(String memName);
    List<Mission> projectAllByAnyWay(String memName,Date startTime, Date endTime, Integer level);
}
