package com.example.scope.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example1Config {

    @Bean
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("KOkO");
        return parrot;

    }

    @Bean
    public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Miko");
        return parrot;
    }

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("mamo");
        return cat;
    }
}
