package com.codekul.july18spring.di;

import com.codekul.july18spring.ioc.Jio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Autowired
    private Employee employee;

    @Autowired
    private Employee employee1;

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
        employee1.display();
    }
}
