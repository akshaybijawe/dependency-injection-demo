package com.akshaybijawe.config;

import com.akshaybijawe.services.GreetingRepository;
import com.akshaybijawe.services.GreetingService;
import com.akshaybijawe.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author arbijawe on 3/4/18
 * @project dependency-injection-demo
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGReetingService("en");
    }

    @Bean
    @Primary
    @Profile({"default","hindi"})
    GreetingService primaryHindiGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGReetingService("hindi");
    }

    @Bean
    @Primary
    @Profile({"default","de"})
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGReetingService("de");
    }
}
