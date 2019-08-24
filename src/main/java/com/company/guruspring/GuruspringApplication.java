package com.company.guruspring;

import com.company.guruspring.controllers.ConstructorInjectedController;
import com.company.guruspring.controllers.GetterInjectedController;
import com.company.guruspring.controllers.MyController;
import com.company.guruspring.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GuruspringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GuruspringApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        myController.home();
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(context.getBean(GetterInjectedController.class).sayHello());
        System.out.println("ASd");
    }

}
