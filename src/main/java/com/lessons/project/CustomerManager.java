package com.lessons.project;
public class CustomerManager implements ICustomerService{

    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {

        this.customerDal = customerDal;
    }



    @Override
    public void add() {
       customerDal.add();
    }
}