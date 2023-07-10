package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.mapper.MemberMapper;
import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author YOSHIGAWA
 * @ Description 这是接口类LoginService的实现类
 * @ Date 2023-07-2023/07/10 15:07
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public String SearchMemAndProj(Integer memId, String memPassword, String projPassword) {
        /*设置项目密令*/
        Project project = projectMapper.selectByProjPassword(projPassword);

        if (project != null) {
            Member member = memberMapper.selectByIdAndPassword(memId, memPassword);
            if (member != null) {
                return "missioninfo";
            } else return "idwrong";
        } else return "projectPasswordwrong";

    }
}
