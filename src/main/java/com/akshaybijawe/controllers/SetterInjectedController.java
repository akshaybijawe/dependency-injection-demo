package com.akshaybijawe.controllers;

import com.akshaybijawe.services.GreetingService;
import com.akshaybijawe.services.GreetingServiceImpl;

public class SetterInjectedController  {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
