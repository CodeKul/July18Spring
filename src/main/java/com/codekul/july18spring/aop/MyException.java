package com.codekul.july18spring.aop;

public class MyException extends Throwable{
    MyException(String str){
        System.out.println(str);
    }
}
