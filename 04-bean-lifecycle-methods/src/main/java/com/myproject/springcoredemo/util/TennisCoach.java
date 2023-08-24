package com.myproject.springcoredemo.util;

import com.myproject.springcoredemo.util.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 5km every day";
    }

    @PostConstruct
    public void doMyStuff(){
        System.out.println("In doMyStuff(): " + getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }
}
