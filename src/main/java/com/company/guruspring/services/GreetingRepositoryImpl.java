package com.company.guruspring.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello -Primary getting service!!!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servico de saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer Grubdinst";
    }
}
