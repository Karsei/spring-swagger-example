package kr.pe.karsei.springswaggerexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
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
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("조은 API")
                        .version("1.0.0")
                        .license(new License().name("MIT"))
                        .description("정말정말 조아요")
                )
                //.addServersItem(new Server()
                //        .url("https://google.com"));
        ;
    }

    @Bean
    public GroupedOpenApi actuator() {
        return GroupedOpenApi.builder()
                .group("Actuator")
                //.displayName("액츄에이터")
                .pathsToMatch("/actuator/**")
                .build();
    }

    @Bean
    public GroupedOpenApi apis() {
        return GroupedOpenApi.builder()
                .group("API")
                .pathsToMatch("/api/**")
                .build();
    }
}
