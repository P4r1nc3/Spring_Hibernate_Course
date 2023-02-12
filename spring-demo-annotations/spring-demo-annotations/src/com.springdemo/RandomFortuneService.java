package com.springdemo;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create array of String
    private String[] data = {
            "Stephen Curry",
            "Lebron James",
            "Jeremy Sochan",
            "Kevin Durant"
    };

    // random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random number from the array
        int index = random.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
