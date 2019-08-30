package com.company.guruspring.services;

/*@Service
@Primary
@Profile({"en","default"})*/
public class PrimaryGreetingService implements GreetingService {
    public static final String HELLO = "Hello -Primary getting service!!!";
    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
