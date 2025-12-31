package com.management.hospital.serviceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class something {

    public something(){
       // System.err.println("Something loaded");
    }

    @Bean
    public String getSomething(){
       // System.err.println("get something executed..");
        return "something";
    }
}
