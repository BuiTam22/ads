package com.zhize.ads.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CommonRest {
    @GetMapping("")
    public String showHome(){

        return "index.html";
    }

    @GetMapping("/blogs")
    public String showListHome(){
        return "blogs.html";
    }

}
