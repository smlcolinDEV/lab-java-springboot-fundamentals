package com.example.labSpringBootFundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Endpoint to say "Hello World!"
    // URL: /hello
    // Method: GET
    // Returns: "Hello World!"
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    // Endpoint to say "Hello {name}!"
    // URL: /hello/{name}
    // Method: GET
    // Parameter: name (PathVariable)
    // Returns: "Hello {name}!"
    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    // Endpoint to add two numbers
    // URL: /add/{num1}/{num2}
    // Method: GET
    // Parameters: num1, num2 (PathVariables)
    // Returns: "The sum of {num1} and {num2} equals {sum}!"
    @GetMapping("/add/{num1}/{num2}")
    public String sum(@PathVariable int num1, @PathVariable int num2){
        int sum = num1 + num2;
        return "The sum of " + num1 + " and " + num2 + " equals " + sum + "!";
    }

    // Endpoint to multiply two numbers
    // URL: /multiply/{num1}/{num2}
    // Method: GET
    // Parameters: num1, num2 (PathVariables)
    // Returns: "The product of {num1} and {num2} equals {mul}!"
    @GetMapping("/multiply/{num1}/{num2}")
    public String mul(@PathVariable int num1, @PathVariable int num2){
        int mul = num1 * num2;
        return "The product of " + num1 + " and " + num2 + " equals " + mul + "!";
    }
}
