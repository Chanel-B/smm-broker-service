package com.ssmbrokerservice.configuration;

import com.ssmbrokerservice.rest_clients.login.LoginRestService;
import com.ssmbrokerservice.rest_clients.student.StudentRestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AutoConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public StudentRestService saveRestTemplate() {
        return new StudentRestService();
    }

    @Bean
    public LoginRestService loginRestTemplate() {
        return new LoginRestService();
    }
}
