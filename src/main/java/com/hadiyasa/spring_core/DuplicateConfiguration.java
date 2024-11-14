package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateConfiguration {

    @Primary // Menandakan bahwa ini adalah primary bean
    @Bean
    public Person rafi(){
        return new Person();
    }

    @Bean(value = "rahma")
    public Person child3(){
        return new Person();
    }

    @Bean
    public Person rani(){
        return new Person();
    }
}
