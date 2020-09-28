package com.example.first.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        Components components = new Components().addSecuritySchemes("passwordScheme",
                new SecurityScheme().type(SecurityScheme.Type.OAUTH2)
                        .flows(new OAuthFlows().password(
                                new OAuthFlow()
                                        .tokenUrl("/oauth/token")
                                        .scopes(new Scopes())
                                )
                        )
                        .in(SecurityScheme.In.HEADER)
                        .name("Authorization")
                        .scheme("bearer"));
        return new OpenAPI()
                .components(components)
                .info(new Info().title("Petstore API").version(appVersion).description(
                        "This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .addSecurityItem(new SecurityRequirement().addList("passwordScheme"));
    }
}
