package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorlfConfiguration {

    @Bean
    public String name(){
        return "shrawan";
    }

}
