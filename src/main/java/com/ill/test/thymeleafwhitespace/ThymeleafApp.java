package com.ill.test.thymeleafwhitespace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;
import com.ill.test.thymeleafwhitespace.ext.WhitespacePostProcessorDialect;

@SpringBootApplication
public class ThymeleafApp {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApp.class, args);
    }

    @Value("${app.whitespace-remove}")
    private boolean removeWhitespace;

    @Autowired
    private ITemplateResolver templateResolver;

    @Bean
    SpringTemplateEngine templateEngine() {
        final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        if (removeWhitespace) {
            templateEngine.addDialect(new WhitespacePostProcessorDialect());
        }
        return templateEngine;
    }

}
