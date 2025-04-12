package com.example.labSpringBootFundamentals.services;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class TimeService {

    // Initialize the current date and time
    public LocalDateTime date = LocalDateTime.now();

    // Method to get the current time
    // Returns: A string with the current hour and minute
    public String getCurrentTime(){
        return "Hello now it's " + date.getHour() + " : " + date.getMinute();
    }

    // Method to get the current date
    // Returns: A string with the current day of the month
    public String getCurrentDate(){
        return "Hello Today it's " + date.getDayOfMonth();
    }

    // Method to get the current day of the week
    // Returns: A string with the current day of the week
    public String getCurrentDay(){
        return "Hello Today it's " + date.getDayOfWeek();
    }

    // Method to get all time-related information
    // Returns: A string containing the current day of the week, day of the month, hour, and minute
    public String getAll(){
        return "Hello today it's " + date.getDayOfWeek() + " "
                + date.getDayOfMonth() + " and it's "
                + date.getHour() + " : " + date.getMinute();
    }
}
