package com.seisoul.projectmanagementsystem.controller;

import com.seisoul.projectmanagementsystem.pojo.Member;
import com.seisoul.projectmanagementsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/api/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}

