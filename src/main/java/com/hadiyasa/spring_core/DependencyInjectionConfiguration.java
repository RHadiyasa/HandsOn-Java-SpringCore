package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.People;
import com.hadiyasa.spring_core.data.PeoplePerson;
import com.hadiyasa.spring_core.data.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public People people(){
        return new People();
    }

    @Bean
    public People people1(){
        return new People();
    }

    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public PeoplePerson peoplePerson(@Qualifier("people1") People people, Person person){
        return new PeoplePerson(person, people);
    }
}
