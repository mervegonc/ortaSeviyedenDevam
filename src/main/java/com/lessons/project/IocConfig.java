package com.lessons.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lessons.project")
public class IocConfig {

        @Bean
        public ICustomerDal database(){
            return new MySqlCustomerDal();
        }
}
