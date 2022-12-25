package com.springdemo;

public class BaseballCoach  implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
