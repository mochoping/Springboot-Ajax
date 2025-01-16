package com.kh.AjaxSpringProject.controller;


import com.kh.AjaxSpringProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/get/avatar")
    public String getAvatar(){
        return "Avatar";
    }
    @GetMapping("/get/randomlogo")
    public String getRandomLogo(){
        return "RandomLogo";
    }

    @GetMapping("/get/product")
    public String getProduct(){
        return "Product";
    }

    @GetMapping("/cafe")
    public String getCafe(){
        return "cafe";
    }
}