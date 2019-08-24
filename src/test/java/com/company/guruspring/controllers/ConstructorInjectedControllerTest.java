package com.company.guruspring.controllers;

import com.company.guruspring.services.GreetingRepositoryImpl;
import com.company.guruspring.services.PrimaryGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new PrimaryGreetingService(new GreetingRepositoryImpl()));
    }
    @Test
    public void testGreeting(){
        assertEquals(PrimaryGreetingService.HELLO,constructorInjectedController.sayHello());
    }
}