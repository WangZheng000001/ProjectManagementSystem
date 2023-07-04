package com.seisoul.projectmanagementsystem.controller;
import com.seisoul.projectmanagementsystem.mapper.MemberMapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    private MemberMapper memberMapper;

    @RequestMapping("/membermission")
    @ResponseBody
    public String membermission(@RequestParam("memId") int memId,
                        @RequestParam("memPassword") String memPassword,
                        @RequestParam("projectPassword")String projectPassword) {
        /*设置项目密令*/
        String changePassword = "1234";
        if (!StringUtils.isEmpty(projectPassword) && changePassword.equals(projectPassword)) {
            Member member = memberMapper.selectByIdAndPassword(memId, memPassword);
            if(member!=null) {
                return member.toString();
            }else return "memId or memPassword is wrong";
        }else return "projectPassword is wrong";
    }
}
