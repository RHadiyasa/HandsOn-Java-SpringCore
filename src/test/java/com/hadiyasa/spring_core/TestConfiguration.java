package com.hadiyasa.spring_core;

import com.hadiyasa.spring_core.data.Car;
import com.hadiyasa.spring_core.service.impl.IdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class TestConfiguration {
    @Configuration
    @Import({Car.class, IdGeneratorBeanPostProcessor.class})
    public static class BeanTestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(BeanTestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testCar(){
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());
    }
}
