package com.zula.lombok.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "lombok.Lombok")
@EnableConfigurationProperties(LombokProperties.class)
public class LombokAutoConfig {
}