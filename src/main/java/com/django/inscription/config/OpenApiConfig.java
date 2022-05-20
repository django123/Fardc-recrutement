package com.django.inscription.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(){
       return new OpenAPI()
                   .info(new Info()
                           .title("Fardc-recrutement")
                           .description("application de Fardc-recrutement")
                           .version("V1.0")
                           .contact(new Contact().name("EDOUGA").url("https://lamazoejp.wixsite.com/enzo")
                                   .email("lamazoejp@gmail.com"))
                           .termsOfService("TOC")
                           .license(new License().name("Licence").url("#")));
    }
}
