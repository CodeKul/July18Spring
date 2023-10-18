package com.codekul.july18spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

//    @Bean
//    public Jio getJio(){
//        return new Jio();
//    }

    @Bean
    public ServiceA serviceA(){
        return new ServiceA();
    }
    @Bean
    public ServiceB serviceB(){
        return new ServiceB(serviceA());
    }
}
