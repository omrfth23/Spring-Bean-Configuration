package com.myproject.springcoredemo.config;

import com.myproject.springcoredemo.util.Coach;
import com.myproject.springcoredemo.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
