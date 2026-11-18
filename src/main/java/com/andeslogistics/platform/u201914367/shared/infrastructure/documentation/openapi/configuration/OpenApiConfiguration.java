package com.andeslogistics.platform.u201914367.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI (Swagger UI) documentation configuration for the Daimler Truck Platform API.
 *
 * @author YOUR_FULL_NAME
 */
@Configuration
public class OpenApiConfiguration {
    @Value("${spring.application.name}")
    String applicationName;

    @Value("${documentation.application.description:Daimler Truck Platform API for authorized workshops}")
    String applicationDescription;

    @Value("${documentation.application.version:1.0.0}")
    String applicationVersion;

    @Value("${server.port:8080}")
    String serverPort;

    /**
     * Builds the OpenAPI definition shown in Swagger UI.
     *
     * @return the OpenAPI definition
     */
    @Bean
    public OpenAPI daimlerTruckPlatformOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Daimler Truck Platform API")
                        .description(this.applicationDescription)
                        .version(this.applicationVersion)
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:" + this.serverPort)
                                .description("Local Development Environment")));
    }
}
