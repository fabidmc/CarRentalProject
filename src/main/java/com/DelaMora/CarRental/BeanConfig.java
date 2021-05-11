package com.DelaMora.CarRental;

import com.DelaMora.CarRental.controllers.Login;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class BeanConfig {

        @Bean
        public Login myBean() {
            return new Login();
        }
}
