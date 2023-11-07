package com.codekul.july18spring.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public int studyPhysics(){
        System.out.println("In boys Study");
        return 340;
    }

    public void getExc()  {
        try {
            throw  new MyException("Throwing exception");
        } catch (MyException e) {
        }
    }

}
