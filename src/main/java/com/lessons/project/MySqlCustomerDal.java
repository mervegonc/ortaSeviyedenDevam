package com.lessons.project;

import org.springframework.stereotype.Component;

@Component("database")
public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Added to MySql");
    }
}