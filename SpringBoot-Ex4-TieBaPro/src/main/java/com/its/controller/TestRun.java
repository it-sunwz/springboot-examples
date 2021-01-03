package com.its.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRun {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "welcome to spring boot study!!!";
    }
}
