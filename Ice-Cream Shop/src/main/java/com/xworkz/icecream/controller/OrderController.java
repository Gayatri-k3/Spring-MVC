package com.xworkz.icecream.controller;

import com.xworkz.icecream.dto.OrderDTO;
import com.xworkz.icecream.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
public class OrderController {
    public OrderController(){
        System.out.println("OrderController loaded" );
    }

    @Autowired
    private OrderService orderService;

    @RequestMapping("/submitOrder")
    public String onOrder(@javax.validation.Valid OrderDTO orderDTO, Model model, BindingResult bindingResult) throws IOException{
        boolean saved = orderService.save(orderDTO);

        if (bindingResult.hasErrors()) {

            bindingResult.getFieldErrors().forEach(error -> System.out.println(error.getField() + " : " + error.getDefaultMessage()));

            System.out.println("Invalid Details");
            model.addAttribute("dto", orderDTO);
            model.addAttribute("message", "Invalid details");
            return "Order";
        }

        if(saved) {
            Double total = orderService.getTotal(orderDTO);
            System.out.println(orderService.getTotal(orderDTO));
            model.addAttribute("name", orderDTO.getName());
            model.addAttribute("type", orderDTO.getFlavour());
            model.addAttribute("quantity", orderDTO.getQuantity());
            model.addAttribute("takeAway", orderDTO.getTakeAway());
            model.addAttribute("addOns", orderDTO.getAddOns());
            model.addAttribute("coupon", orderDTO.getCoupon());
            model.addAttribute("total", total);

            String filename= orderDTO.getMultipartFile().getOriginalFilename();
            byte[] bytes= orderDTO.getMultipartFile().getBytes();
            Path path = Paths.get("C:\\Users\\91829\\Desktop\\Multipart\\"+orderDTO.getName()+System.currentTimeMillis());
            Files.write(path,bytes);

            return "OrderResult";
        }
        else {
            model.addAttribute("Error", "Invalid Details, please fill the form again");
            return "/Order.jsp";
        }
    }
}
