package com.xworkz.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RTOController {

    @RequestMapping("/submitRTO")
    public String submitRTO(Model model,
                            @RequestParam String officeName,
                            @RequestParam String officerName,
                            @RequestParam String district,
                            @RequestParam String code,
                            @RequestParam String type,
                            @RequestParam String contact) {
        model.addAttribute("officeName", officeName);
        model.addAttribute("officerName", officerName);
        model.addAttribute("district", district);
        model.addAttribute("code", code);
        model.addAttribute("type", type);
        model.addAttribute("contact", contact);
        return "/RTODetails.jsp";
    }
}
