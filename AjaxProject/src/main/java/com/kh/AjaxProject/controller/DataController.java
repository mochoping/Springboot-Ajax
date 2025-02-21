package com.kh.AjaxProject.controller;


import com.kh.AjaxProject.dto.Member;
import com.kh.AjaxProject.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DataController {

    private final MemberService memberService;

    public DataController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/api/data")
    public ResponseEntity<Map<String,String>> getData(){
        Map<String,String> map = new HashMap<>();
        map.put("msg", "안녕하세요~~");
        map.put("status", "성공~~");
        return ResponseEntity.ok(map);
    }

    @GetMapping("/api/member")
    public List<Member> getAllMembers(){
        List<Member> members = memberService.getAllMembers();
        System.out.println(members.toString());
        return members;
    }
}