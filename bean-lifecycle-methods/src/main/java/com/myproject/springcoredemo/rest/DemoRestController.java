package com.myproject.springcoredemo.rest;

import com.myproject.springcoredemo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //define private field for dependency
    private Coach myCoach;


    //define constructor for dependency injection
    @Autowired
    public void setCoach(
            @Qualifier("swimCoach") Coach myCoach){
        System.out.println(getClass());
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
