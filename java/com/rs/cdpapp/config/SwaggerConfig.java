/**
 * 
 */
package com.rs.cdpapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Nandhu
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final String BASIC_AUTH = "basicAuth";
	private static final String BEARER_AUTH = "Bearer";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rs.cdpapp.controller")).build()
				.apiInfo(apiEndPointsInfo()).securitySchemes(securitySchemes()).securityContexts(securityContexts());
	}

	private ApiInfo apiEndPointsInfo() {
		return new ApiInfoBuilder().title("IIB INTEGRATION APP REST API").description("IIB INTEGRATION APP REST API")
				.contact(new Contact("Nandhu", "www.fasoftwares.com", "nandhagopal.m@fasoftwares.com"))
				.license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").version("1.0.0")
				.build();
	}

	private List<SecurityScheme> securitySchemes() {

		List<SecurityScheme> list = new ArrayList<>();
//		list.add(new BasicAuth(BASIC_AUTH));
		list.add(new ApiKey(BEARER_AUTH, "Authorization", "header"));

		return list;
	}

	private SecurityContext securityContext() {
		return SecurityContext.builder().securityReferences(securityReferences()).forPaths(PathSelectors.ant("/api/**"))
				.build();
	}

	private List<SecurityContext> securityContexts() {
		List<SecurityContext> list = new ArrayList<>();
		list.add(securityContext());
		return list;
	}

	private SecurityReference basicAuthReference() {
		return new SecurityReference(BASIC_AUTH, new AuthorizationScope[0]);
	}

	private SecurityReference bearerAuthReference() {
		return new SecurityReference(BEARER_AUTH, new AuthorizationScope[0]);
	}

	private List<SecurityReference> securityReferences() {
		List<SecurityReference> list = new ArrayList<>();
//		list.add(basicAuthReference());
		list.add(bearerAuthReference());
		return list;
	}
}
