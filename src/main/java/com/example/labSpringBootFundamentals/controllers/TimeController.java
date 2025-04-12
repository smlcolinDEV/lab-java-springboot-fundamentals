package com.example.labSpringBootFundamentals.controllers;

import com.example.labSpringBootFundamentals.services.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    // Dependency injection of TimeService
    private final TimeService ts;

    // Constructor-based dependency injection
    public TimeController(TimeService ts) {
        this.ts = ts;
    }

    // Endpoint to get the current time
    // URL: /time
    // Method: GET
    // Returns: The current time as a string
    @GetMapping("/time")
    public String time(){
        return ts.getCurrentTime();
    }

    // Endpoint to get the current date
    // URL: /date
    // Method: GET
    // Returns: The current date as a string
    @GetMapping("/date")
    public String date(){
        return ts.getCurrentDate();
    }

    // Endpoint to get the current day of the week
    // URL: /day
    // Method: GET
    // Returns: The current day of the week as a string
    @GetMapping("/day")
    public String day(){
        return ts.getCurrentDay();
    }

    // Endpoint to get all time-related information
    // URL: /all
    // Method: GET
    // Returns: A string containing the current time, date, and day of the week
    @GetMapping("/all")
    public String all(){
        return ts.getAll();
    }
}
