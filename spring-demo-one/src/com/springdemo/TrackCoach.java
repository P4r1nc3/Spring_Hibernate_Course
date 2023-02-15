package com.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    TrackCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    //Add init method
    public void doMyStartupStaff() {
        System.out.println("TrackCoach: inside method doMyStartupStaff");
    }

    //Add destroy method
    public void doMyCleanupStaff() {
        System.out.println("TrackCoach: inside method doMyCleanupStaff");
    }
}
