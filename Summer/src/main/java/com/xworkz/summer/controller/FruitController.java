package com.xworkz.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FruitController {

    @RequestMapping("/submitFruit")
    public String submitFruit(Model model,
                              @RequestParam String name,
                              @RequestParam String color,
                              @RequestParam String price,
                              @RequestParam String weight,
                              @RequestParam String taste,
                              @RequestParam String seasonal,
                              @RequestParam String origin,
                              @RequestParam String vitamin,
                              @RequestParam String shelfLife,
                              @RequestParam String type) {
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        model.addAttribute("price", price);
        model.addAttribute("weight", weight);
        model.addAttribute("taste", taste);
        model.addAttribute("seasonal", seasonal);
        model.addAttribute("origin", origin);
        model.addAttribute("vitamin", vitamin);
        model.addAttribute("shelfLife", shelfLife);
        model.addAttribute("type", type);
        return "/FruitResult.jsp";
    }
}
