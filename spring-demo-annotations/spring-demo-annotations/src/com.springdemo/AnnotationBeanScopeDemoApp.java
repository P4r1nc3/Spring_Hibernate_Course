package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach theCoach = context .getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context .getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // printing result
        System.out.println(result);

        System.out.println(theCoach);

        System.out.println(alphaCoach);

        // close the context
        context.close();
    }
}
