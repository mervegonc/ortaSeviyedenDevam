package com.lessons.project;
public class CustomerManager {

    ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void Add() {
        //work codes
        iCustomerDal.add();
    }

}