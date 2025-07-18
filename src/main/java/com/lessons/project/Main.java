package com.lessons.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext
                        (IocConfig.class);



        ICustomerService customerService = context.getBean("service", ICustomerService.class);
        customerService.add();
    }

}



