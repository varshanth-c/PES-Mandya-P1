package com.explore.springboot_ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Execution {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(MyBeanFactory.class);
        // dependency injection
        // Professor professor = factory.getBean(Professor.class);
        Professor professor = factory.getBean("ece",Professor.class);
        System.out.println(professor);
    }
}
