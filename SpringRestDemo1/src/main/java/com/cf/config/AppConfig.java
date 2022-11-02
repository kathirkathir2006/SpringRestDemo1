package com.cf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc//is used for enabling Spring MVC in an application
//The XML equivalent with similar functionality is <mvc:annotation-driven/>.
//The configuration can be customized by the @Configuration 
//class implementing the WebMvcConfigurer
@ComponentScan(basePackages = "com.cf")
public class AppConfig {

}
