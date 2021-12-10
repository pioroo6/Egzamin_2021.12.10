package pl.aleksander_figielski.hotelsapplication.hotels.remote.config;

import java.util.Collections;

@Configuration
@EnableSwagger2

public class SwaggerConfiguration {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.aleksander_figielski.hotelsapplication"))
                .build()
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes()
                .apiInfo(new ApiInfo("Room information", "", "", "", new Contact("", "", "")
                        , "", "", Collections.emptyList()));

    }
}
