package com.xworkz.icecream.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String name;
    private String flavour;
    private Integer quantity;
    private String takeAway;
    private String coupon;
    private String AddOns;
}
