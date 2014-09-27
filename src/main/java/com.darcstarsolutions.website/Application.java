package com.darcstasolutions.website;

import com.darcstarsolutions.website.beans.Category;
import com.darcstarsolutions.website.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = "com.darcstarsolutions.website")
@EntityScan(basePackages = "com.darcstarsolutions.website.beans")
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(CategoryRepository categoryRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                categoryRepository.save(new Category("Family Games", "Amazing games for the whole family!"));
                categoryRepository.save(new Category("Financial Solutions", "Solving your financial problems!"));
                categoryRepository.save(new Category("Baby Genius", "Educate your child for a challenging world!"));
            }
        };
    }


}
