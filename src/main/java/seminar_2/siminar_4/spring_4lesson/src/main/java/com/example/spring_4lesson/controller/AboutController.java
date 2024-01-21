package com.example.spring_4lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboot(){
        return "about.html";    }
}
