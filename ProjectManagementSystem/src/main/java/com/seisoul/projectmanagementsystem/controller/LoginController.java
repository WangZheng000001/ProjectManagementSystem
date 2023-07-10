package com.seisoul.projectmanagementsystem.controller;
import com.seisoul.projectmanagementsystem.mapper.MemberMapper;
import com.seisoul.projectmanagementsystem.mapper.ProjectMapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.pojo.Project;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private ProjectMapper projectMapper;

    @RequestMapping("/membermission")
    public String membermission(@RequestParam("memId") int memId,
                        @RequestParam("memPassword") String memPassword,
                        @RequestParam("projectPassword")String projectPassword) {
        /*设置项目密令*/
        Project project = projectMapper.selectByProjPassword(projectPassword);

        /*String changePassword = "1234";
        if (!StringUtils.isEmpty(projectPassword) && changePassword.equals(projectPassword)) {
            Member member = memberMapper.selectByIdAndPassword(memId, memPassword);
            if(member!=null) {
                return member.toString();
            }else return "memId or memPassword is wrong";
        }else return "projectPassword is wrong";
        }*/
        if(project != null){
            Member member = memberMapper.selectByIdAndPassword(memId, memPassword);
            if(member!=null) {
                return "missioninfo";
            }else return "idwrong";
        }else return "projectPasswordwrong";
    }
    @RequestMapping("/menbermission")
    @ResponseBody
    public String proj(@RequestParam("memName")String memName){
        System.out.println(memName);
        Member member = memberMapper.selectByMemName(memName);
        System.out.println(member.getMemId());
        int memId = member.getMemId();
        Project project = projectMapper.selectByFkMemId(memId);
        return project.toString();
    }
}
