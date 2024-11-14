package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testDuplicate() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        // Person person = context.getBean(Person.class); // Ini akan error
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            Person person = context.getBean(Person.class);
        });
    }

    @Test
    void testDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Person person = context.getBean(Person.class); // Primary bean (Otomatis rafi yang diambil)
        Person rafi = context.getBean("rafi", Person.class);
        Person rani = context.getBean("rani", Person.class);

        Assertions.assertNotEquals(rafi, rani);
        Assertions.assertSame(person, rafi);
    }

    @Test
    void renameBeanTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Person person = context.getBean(Person.class);
        Person child3 = context.getBean("rahma", Person.class);

        Assertions.assertNotEquals(person, child3);
    }
}
