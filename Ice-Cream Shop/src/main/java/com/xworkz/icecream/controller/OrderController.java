package com.xworkz.icecream.controller;

import com.xworkz.icecream.dto.OrderDTO;
import com.xworkz.icecream.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrderController {
    public OrderController(){
        System.out.println("OrderController loaded" );
    }

    @Autowired
    private OrderService orderService;

    @RequestMapping("/submitOrder")
    public String onOrder(OrderDTO orderDTO, Model model){
        boolean saved = orderService.save(orderDTO);
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

            model.addAttribute("name", orderDTO.getName());
            model.addAttribute("total", total);
            return "/OrderResult.jsp";
        }
        else {
            model.addAttribute("Error", "Invalid Details, please fill the form again");
            return "/Order.jsp";
        }
    }
}
