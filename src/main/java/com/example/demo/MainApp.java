package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] srgs) {

        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingsClass greetingsClass = (GreetingsClass) applicationContext.getBean("myBean");

        greetingsClass.sendGreetings();
    }
}

