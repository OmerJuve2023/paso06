package com.example.demo.swagger;

import com.example.demo.controllers.Controller;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@EnableWebMvc
@Component
public class SwaggerConfig {

    @Bean
    public Docket configApi(TypeResolver typeResolver) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .additionalModels(typeResolver.resolve(Controller.class))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo("Api Rest to laptop service",
                "information about the features of the " +
                        "Laptop and complements",
                "1.0",
                "https://web.facebook.com/omer.rafael.58",
                new Contact("Omar Enrique Rafael Toribio", "https://www.linkedin" +
                        ".com/in/omar-enrique-rafael-toribio-a7152b210/",
                        "0333182023@gmail.com"),
                "none",
                "none",
                Collections.emptyList());
    }

}
