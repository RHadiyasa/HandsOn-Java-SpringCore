package com.hadiyasa.spring_core.service.impl;

import com.hadiyasa.spring_core.service.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.IdGenerator;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("ID Generator Processor for bean{}", beanName);
        if (bean instanceof IdAware) {
            log.info("Set Id generator for bean{}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
