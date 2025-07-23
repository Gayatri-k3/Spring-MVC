package com.xworkz.summer.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NameController {
    public NameController(){
        System.out.println("NameController created");
    }
    @RequestMapping("/name")
    public String onSend(Model model, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("mName") String mName){
        System.out.println("Name: "+fname+","+lname+","+mName);
        model.addAttribute("Fname",fname);
        model.addAttribute("Lname",lname);
        model.addAttribute("Mname",mName);
        return "/NameResult.jsp";
    }
}
