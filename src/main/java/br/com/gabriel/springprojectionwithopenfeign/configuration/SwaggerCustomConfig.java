package br.com.gabriel.springprojectionwithopenfeign.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerCustomConfig {
    @Bean
    public OpenAPI customOpenAPI(@Value("${project-title}") String title,
                                 @Value("${project-description}") String description,
                                 @Value("${project-version}") String version) {
        return new OpenAPI()
                .info(new Info()
                        .title(title)
                        .version(version)
                        .description(description)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}
