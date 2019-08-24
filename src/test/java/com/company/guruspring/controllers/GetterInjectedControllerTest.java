package com.company.guruspring.controllers;

import com.company.guruspring.services.GreetingRepositoryImpl;
import com.company.guruspring.services.PrimaryGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetterInjectedControllerTest {
    private GetterInjectedController getterInjectedController;


    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new PrimaryGreetingService(new GreetingRepositoryImpl()));
    }
    @Test
    public void testGreeting(){
        assertEquals(PrimaryGreetingService.HELLO,getterInjectedController.sayHello());
    }
}