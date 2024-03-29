package com.company.guruspring.services;

/*@Service
@Primary
@Profile("de")*/
public class PrimaryGermanGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
