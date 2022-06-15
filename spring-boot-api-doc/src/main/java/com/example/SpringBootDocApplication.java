package com.example;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@Api(value = "Benim Pet API dökümantasyonum")
public class SpringBootDocApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDocApplication.class, args);
    }
}
