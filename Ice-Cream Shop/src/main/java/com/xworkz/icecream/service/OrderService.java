package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.OrderDTO;

public interface OrderService {
    boolean save(OrderDTO orderDTO);
    Double getTotal(OrderDTO orderDTO);
}
