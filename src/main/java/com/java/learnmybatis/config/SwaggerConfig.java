package com.java.learnmybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author yuanhang08
 * @date 2022年11月21日
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {

        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.java.learnmybatis.controller"))
                .build()
                .apiInfo(createApiInfo());

    }

    /**
     * 配置swagger apiinfo bean
     */
    @Bean
    public ApiInfo createApiInfo() {
        Contact contact = new Contact("yuanhang", "http://localhost:8081/swagger-ui/", "967584602@qq.com");

        return new ApiInfoBuilder()
                .title("用户标签管理系统")
                .description("用户标签管理系统接口文档描述")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
