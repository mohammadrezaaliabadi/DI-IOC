package com.company.guruspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;
    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
