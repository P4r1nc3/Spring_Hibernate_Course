package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    FortuneService fortuneService;

    // default constructor
    public TennisCoach () {
    }

    // constructor injection
    /*
    public TennisCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    */

    // setter injection
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    */

    // method injection
    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

