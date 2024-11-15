package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeBeanTest {

    @Test
    void scopeBeanTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);

        Person person1 = applicationContext.getBean(Person.class);
        Person person2 = applicationContext.getBean(Person.class);
        Person person3 = applicationContext.getBean(Person.class);

        Assertions.assertNotEquals(person1, person2);
        Assertions.assertNotEquals(person3, person2);
    }
}
