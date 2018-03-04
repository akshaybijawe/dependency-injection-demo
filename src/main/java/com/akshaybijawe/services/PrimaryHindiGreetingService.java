package com.akshaybijawe.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryHindiGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryHindiGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getHindiGreeting();
    }
}
