package com.xworkz.summer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FirstController {



    @RequestMapping("/submit")
    public String onSubmit(){
        System.out.println("Response to submit");
        return "/index.jsp";
    }
}
