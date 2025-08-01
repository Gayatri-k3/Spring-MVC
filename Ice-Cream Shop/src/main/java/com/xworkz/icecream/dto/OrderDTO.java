package com.xworkz.icecream.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    @Size(min=2, max = 50)
    private String name;

    @Size(min=2, max = 50)
    private String flavour;

    @Min(1) @Max(20)
    private Integer quantity;

    @Size(min=2, max = 50)
    private String takeAway;

    @Size(min=2, max = 50)
    private String coupon;

    @Size(min=2, max = 50)
    private String AddOns;

    private MultipartFile multipartFile;
}
