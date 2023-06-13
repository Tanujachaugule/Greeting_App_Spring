package com.springappdemo.greetingapplicationtest.configuration;

import org.springframework.context.annotation.Configuration;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
@Configuration

public class WebConfiguration {
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.addUrlMappings("/h2/*");
        return registrationBean;
    }
}
