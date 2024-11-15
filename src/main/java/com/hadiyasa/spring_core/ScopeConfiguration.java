package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Person person(){
        log.info("Creating person");
        return new Person();
    }
}
