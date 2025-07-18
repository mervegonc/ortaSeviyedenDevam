package com.lessons.project;
public class CustomerManager implements ICustomerService{

    ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void Add() {
        //work codes
        iCustomerDal.add();
    }

    @Override
    public void add() {
        
    }
}