package com.hadiyasa.spring_core.config;

import com.hadiyasa.spring_core.service.impl.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
