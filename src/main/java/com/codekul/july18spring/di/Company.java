package com.codekul.july18spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Autowired
    private Employee employee;

//    @Autowired
//    public void setEmployee(Employee employee) { //setter based injection
//        this.employee = employee;
//    }

//    @Autowired
//    public Company(Employee employee) { //constructor based injection
//        this.employee = employee;
//    }

    public void showEmp(){
        employee.display();
    }
}
