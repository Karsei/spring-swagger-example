package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "스프링 API 명세",
        description = "매우 완전 짱좋게 잘 작성한 API 명세서",
        version = "v1"
))
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .addServersItem(new Server()
                        .url("https://google.com"));
    }
//    @Bean
//    public GroupedOpenApi openApi() {
//        String[] paths = {"/v1/**"};
//
//        return GroupedOpenApi.builder()
//                .group("yeah")
//                .pathsToMatch(paths)
//                .build();
//    }
}
