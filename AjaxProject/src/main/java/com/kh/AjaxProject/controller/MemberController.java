package com.kh.AjaxProject.controller;

import com.kh.AjaxProject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
// ResponseEntity 제대로 데이터를 전달했는지 확인
    /**
     * ResponseEntity<>
     *     ResponseEntity.ok();
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
/*
    @GetMapping("/api/members")
    public  List<Member> getAllMembers() {
        return memberSerivce.getAllMembers()   ;
    }

 */
}
