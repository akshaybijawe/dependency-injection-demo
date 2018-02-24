package com.akshaybijawe.controllers;

import com.akshaybijawe.services.GreetingService;

public class ConstructorInjectedController  {

    public GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
