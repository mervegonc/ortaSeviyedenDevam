package com.lessons.project;

public class MsSqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Added to MsSQl");
    }
}
