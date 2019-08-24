package com.company.guruspring;

import com.company.guruspring.services.GetterGreetingService;
import com.company.guruspring.services.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuruspringApplicationTests {
    @Autowired
    private GreetingService greetingService;
    @Test
    public void contextLoads() {
        System.out.println(greetingService.sayGreeting());
    }

}
