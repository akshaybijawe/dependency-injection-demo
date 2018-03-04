package com.akshaybijawe.services;

import org.springframework.stereotype.Component;

/**
 * @author arbijawe on 3/4/18
 * @project dependency-injection-demo
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getHindiGreeting() {
        return "Namaste";
    }

    @Override
    public String getGermanGreeting() {
        return  "Primärer Grußdienst";
    }
}
