package com.company.guruspring.config;

import com.company.guruspring.services.GreetingRepository;
import com.company.guruspring.services.GreetingService;
import com.company.guruspring.services.GreetingServiceFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.company.guruspring"})
public class Config {
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
}
