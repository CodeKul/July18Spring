package com.codekul.july18spring.ioc;

public class Jio implements Sim{

    @Override
    public void message() {
        System.out.println("In Jio message");
    }

    @Override
    public void call() {
        System.out.println("In Jio call");

    }
}
