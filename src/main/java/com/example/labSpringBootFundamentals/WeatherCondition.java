package com.example.labSpringBootFundamentals;

import java.util.Random;

public enum WeatherCondition {
    Sunny, Rainy, Cloudy, Windy;

    // Initialize a Random object for generating random values
    private static final Random PRNG = new Random();

    // Method to get a random weather condition
    // Returns: A random WeatherCondition enum value
    public static WeatherCondition randomWeather()  {
        WeatherCondition[] wc = values(); // Get all enum values
        return wc[PRNG.nextInt(wc.length)]; // Return a random enum value
    }
}
