package com.xworkz.icecream.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.icecream")
public class SpringConfig {
    public SpringConfig(){
        System.out.println("SpringConfig loaded");
    }
}
