package com.steer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author yanl
 * @date 2019-12-25 10:46 上午
 */
@Configuration // 告诉Springboot加载这个配置类
@EnableSwagger2  // 启用swagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());  // 如果没有文档信息配置，这行就不需要
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Boot项目集成Swagger实例文档",
                "文档描述：xxx。",
                "version：API V1.0",
                "Terms of service",
                new Contact("Contact", "https://www.jianshu.com/u/8845b39c7928", "email@gmail.com"),
                "Apache", "http://www.apache.org/", Collections.emptyList());
    }
}
