package com.example.labSpringBootFundamentals.controllers;

import com.example.labSpringBootFundamentals.services.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    // Dependency injection of WeatherService
    private final WeatherService ws;

    // Constructor-based dependency injection
    public WeatherController(WeatherService ws) {
        this.ws = ws;
    }

    // Endpoint to get the current weather condition
    // URL: /weather/condition
    // Method: GET
    // Returns: "Today it's {condition}!"
    @GetMapping("weather/condition")
    public String curCondition(){
        return "Today it's " + ws.getCondition() + "!";
    }

    // Endpoint to get the current temperature
    // URL: /weather/temperature
    // Method: GET
    // Returns: "Currently the temperature is {temperature}°C"
    @GetMapping("weather/temperature")
    public String curTemp(){
        return "Currently the temperature is " + ws.getCurrentTemp() + "°C";
    }

    // Endpoint to get the current wind speed
    // URL: /weather/wind
    // Method: GET
    // Returns: "Currently the wind blows at {windSpeed} km/h!"
    @GetMapping("weather/wind")
    public String wind(){
        return "Currently the wind blows at " + ws.getCurrentWind() + " km/h!";
    }

    // Endpoint to get all weather information
    // URL: /weather/all
    // Method: GET
    // Returns: "Today it's {condition}! Currently the temperature is {temperature}°C and the wind blows at {windSpeed} km/h!"
    @GetMapping("weather/all")
    public String all(){
        return "Today it's " + ws.getCondition() + "!" +
                " Currently the temperature is " + ws.getCurrentTemp() +
                "°C and the wind blows at " + ws.getCurrentWind() + " km/h!";
    }
}
