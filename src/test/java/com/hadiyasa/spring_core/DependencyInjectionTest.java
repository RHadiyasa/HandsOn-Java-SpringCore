package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.People;
import com.hadiyasa.spring_core.data.PeoplePerson;
import com.hadiyasa.spring_core.data.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDI(){
        Person person = applicationContext.getBean(Person.class);
        People people = applicationContext.getBean("people1", People.class);
        PeoplePerson peoplePerson = applicationContext.getBean(PeoplePerson.class);

        Assertions.assertSame(people, peoplePerson.getPeople());
        Assertions.assertSame(person, peoplePerson.getPerson());
    }

    @Test
    void testNoDI() {
        var people = new People();
        var person = new Person();

        // inject person & people ke peoplePerson
        var personPeople = new PeoplePerson(person, people);

        // getPeople and getPerson from peoplePerson
        Assertions.assertSame(people, personPeople.getPeople());
        Assertions.assertSame(person, personPeople.getPerson());
    }


}
