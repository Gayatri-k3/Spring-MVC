package com.xworkz.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring.component")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("SpringConfiguration loaded");
    }
}
