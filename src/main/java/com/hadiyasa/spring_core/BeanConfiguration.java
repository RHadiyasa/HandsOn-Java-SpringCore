package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j // Logging
@Configuration
public class BeanConfiguration {

    @Bean
    public Person person(){
        Person person = new Person();
        log.info("Create new Person");
        return person;
    }
}
