package com.company.guruspring.controllers;

import com.company.guruspring.services.GreetingRepositoryImpl;
import com.company.guruspring.services.PrimaryGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new PrimaryGreetingService(new GreetingRepositoryImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(PrimaryGreetingService.HELLO,propertyInjectedController.greetingService.sayGreeting());
    }
}