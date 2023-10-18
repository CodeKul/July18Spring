package com.codekul.july18spring.di;

import com.codekul.july18spring.ioc.Jio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
