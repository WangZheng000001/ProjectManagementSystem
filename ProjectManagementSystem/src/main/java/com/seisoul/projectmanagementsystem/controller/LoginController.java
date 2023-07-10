package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/membermission")
    public String membermission(@RequestParam("memId") int memId,
                                @RequestParam("memPassword") String memPassword,
                                @RequestParam("projectPassword") String projPassword) { //这条代码还是得写在controller里

        String result = loginService.SearchMemAndProj(memId, memPassword, projPassword);
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
