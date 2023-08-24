package com.myproject.springcoredemo.util;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters to warm up. ";
    }
}
