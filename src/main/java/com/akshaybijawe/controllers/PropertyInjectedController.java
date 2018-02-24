package com.akshaybijawe.controllers;

import com.akshaybijawe.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }


}
