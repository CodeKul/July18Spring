package com.codekul.july18spring.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    int id;

    String name;

    public Employee(){
        System.out.println("In Employee");
    }

    public void display(){
        System.out.println("In display");
    }

}
