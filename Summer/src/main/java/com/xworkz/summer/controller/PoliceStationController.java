package com.xworkz.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PoliceStationController {

    @RequestMapping("/submitPolice")
    public String submitPolice(Model model,
                               @RequestParam String stationName,
                               @RequestParam String location,
                               @RequestParam String inspectorName,
                               @RequestParam String jurisdiction,
                               @RequestParam int officerCount,
                               @RequestParam String emergency,
                               @RequestParam String email,
                               @RequestParam String contact,
                               @RequestParam String city,
                               @RequestParam String state) {
        model.addAttribute("stationName", stationName);
        model.addAttribute("location", location);
        model.addAttribute("inspectorName", inspectorName);
        model.addAttribute("jurisdiction", jurisdiction);
        model.addAttribute("officerCount", officerCount);
        model.addAttribute("emergency", emergency);
        model.addAttribute("email", email);
        model.addAttribute("contact", contact);
        model.addAttribute("city", city);
        model.addAttribute("state", state);
        return "/PoliceResult.jsp";
    }
}
