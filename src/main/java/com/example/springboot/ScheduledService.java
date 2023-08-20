package com.example.springboot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {

    @Scheduled(fixedRate = 10000) // 120000 milliseconds = 2 minutes
    public void runScheduledTask() {
        // Your task logic goes here
        System.out.println("Scheduled task executed at: " + new java.util.Date());
    }
}
