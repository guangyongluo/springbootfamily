package com.vilin.springboot.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ConditionalOnWebApplication
@Configuration
@Import(com.vilin.springboot.config.WebConfiguration.class)
public class WebAutoConfiguration {
}
