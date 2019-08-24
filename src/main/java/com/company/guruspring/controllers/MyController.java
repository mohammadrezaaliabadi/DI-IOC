package com.company.guruspring.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String home(){
        System.out.println("Hello !!!");
        return "foo";
    }
}
