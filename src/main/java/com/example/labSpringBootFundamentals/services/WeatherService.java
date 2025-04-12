package com.example.labSpringBootFundamentals.services;

import com.example.labSpringBootFundamentals.WeatherCondition;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {

    // Initialize a Random object for generating random values
    Random rand = new Random();

    // Method to get the current temperature
    // Returns: A random temperature between -10 and 40 degrees Celsius
    public int getCurrentTemp(){
        int temp = rand.nextInt(50); // Generates a random number between 0 and 49
        return temp - 10; // Adjusts the range to be between -10 and 40
    }

    // Method to get the current weather condition
    // Returns: A random WeatherCondition enum value
    public WeatherCondition getCondition(){
        return WeatherCondition.randomWeather(); // Assumes randomWeather() is a static method in WeatherCondition
    }

    // Method to get the current wind speed
    // Returns: A random wind speed between 0 and 99 km/h
    public int getCurrentWind(){
        return rand.nextInt(100); // Generates a random number between 0 and 99
    }
}
