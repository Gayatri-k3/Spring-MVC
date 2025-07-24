package com.xworkz.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HospitalController {

    @RequestMapping("/submitHospital")
    public String submitHospital(Model model,
                                 @RequestParam String name,
                                 @RequestParam String location,
                                 @RequestParam String type,
                                 @RequestParam int beds,
                                 @RequestParam String emergency,
                                 @RequestParam String contact) {
        model.addAttribute("name", name);
        model.addAttribute("location", location);
        model.addAttribute("type", type);
        model.addAttribute("beds", beds);
        model.addAttribute("emergency", emergency);
        model.addAttribute("contact", contact);
        return "/HospitalResult.jsp";
    }
}
