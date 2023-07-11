package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/memberinfo")
    public String memberinfo(@RequestParam("memId") int memId,
                             @RequestParam("memPassword") String memPassword,
                             @RequestParam("projectPassword") String projPassword, Model model) { //这条代码还是得写在controller里

        String result = loginService.searchMemAndProj(memId, memPassword, projPassword);
        /*List<String> members = loginService.selectAllMemberName();*/
        List<Member> members = loginService.selectAllMember();
        System.out.println(members);
        model.addAttribute("members",members);
        System.out.println("对象result的数据为" + result);//在控制台返回result内容
        return result;
    }

    /*待施工*/
//    @RequestMapping("/menbermission")
//    @ResponseBody
//    public String proj(@RequestParam("memName") String memName) {   //这条代码还是得写在controller里
//        System.out.println(memName);//返回给控制台
//        Member member = memberMapper.selectByMemName(memName);//返回member对象
//        System.out.println(member.getMemId());//返回给控制台
//        int memId = member.getMemId();//取得member中的id
//        Project project = projectMapper.selectByFkMemId(memId);
//        return project.toString();
//    }
}
