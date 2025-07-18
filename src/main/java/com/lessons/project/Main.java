package com.lessons.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext
                        (IocConfig.class);



        CustomerManager customerManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
        customerManager.Add();
    }

}



