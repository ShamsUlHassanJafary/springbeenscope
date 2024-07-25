package com.example.scope.example2;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Example2Config {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("Doggiiii");
        return dog;
    }
}
