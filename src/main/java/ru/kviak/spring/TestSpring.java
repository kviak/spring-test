package ru.kviak.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        System.out.println( context.getBean("computer", Computer.class).toString());

        context.close();
    }
}
