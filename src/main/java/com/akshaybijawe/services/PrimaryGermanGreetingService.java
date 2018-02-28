package com.akshaybijawe.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author arbijawe on 2/27/18
 * @project dependency-injection-demo
 */

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primäre Begrüßung";
    }
}
