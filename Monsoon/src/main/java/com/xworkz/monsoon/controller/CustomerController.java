package com.xworkz.monsoon.controller;

import com.xworkz.monsoon.dto.CustomerDTO;
import com.xworkz.monsoon.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
    public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/form")
    public String showForm() {
        return "index";
    }

    @RequestMapping("/submit")
    public ModelAndView handleSubmit(@ModelAttribute CustomerDTO dto) {
        int saved = repository.save(dto);
        String message = saved == 1 ? "Customer saved successfully!" : "Failed to save customer.";
        return new ModelAndView("index", "message", message);
    }
}