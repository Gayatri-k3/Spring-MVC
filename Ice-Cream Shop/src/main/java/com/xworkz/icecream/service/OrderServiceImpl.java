package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{
    List<String> coupons = new ArrayList<>();
    Map<String, Double> flavourPrices = new HashMap<>();

    public OrderServiceImpl(){
        System.out.println("OrderService loaded");
        coupons.add("DISCOUNT");
        coupons.add("CODE");
        coupons.add("FRIDAY");

        flavourPrices.put("Vanilla", 50.0);
        flavourPrices.put("Chocolate", 60.0);
        flavourPrices.put("Strawberry", 70.0);
        flavourPrices.put("Mango", 80.0);
    }
    @Override
    public boolean save(OrderDTO orderDTO) {
        if(orderDTO!=null){
            if(orderDTO.getName().length()<2 || orderDTO.getName().length()>20){
                System.out.println("Name invalid");
                return false;
            }
            if(orderDTO.getQuantity()<1 || orderDTO.getQuantity()>10){
                System.out.println("Invalid Quantity");
                return false;
            }
            if(!flavourPrices.containsKey(orderDTO.getFlavour())){
                System.out.println("Invalid Flavour");
                return false;
            }
//            if (!coupons.contains(orderDTO.getCoupon())){
//                System.out.println("Invalid Coupon");
//                return false;
//            }
            if (orderDTO.getTakeAway()==null || orderDTO.getTakeAway().isEmpty()){
                System.out.println("TakeAway Empty");
                return false;
            }
        }
        System.out.println("All Validations are passed");
        return true;

    }
    @Override
    public Double getTotal(OrderDTO orderDTO){
        Double price = flavourPrices.get(orderDTO.getFlavour());
        Double total = price * orderDTO.getQuantity();
        if (coupons.contains(orderDTO.getCoupon())){
            total = total - (total*0.10);
        }else {
            return total;
        }
        return total;
    }
}
