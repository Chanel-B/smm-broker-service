package com.ssmbrokerservice.configuration;//package com.broker.configuration;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfigurations {
//    @Value("${allowed.origin}")
//    private String httpOrigin;
//    @Bean
//    public WebMvcConfigurer getCorsConfiguration(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")//this will apply to every Endpoint to our applications
//                        .allowedOrigins("/**")//we can specify here multiple origins
//                        .allowedMethods("GET", "POST", "PUT", "DELETE")//THIS ACCEPTS ONLY THESE METHODS//
//                        .allowedMethods("*") //.
//                        .allowedHeaders("*");
//            }
//        };
//    }
//}
