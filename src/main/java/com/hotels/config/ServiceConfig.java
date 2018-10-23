package com.hotels.config;

import com.hotels.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ValidationService validationService() {
        return new ValidationServiceImp();
    }

    @Bean
    public AllHotelService allHotelService() {
        return new MockAllHotelService();
    }

    @Bean
    public CheapestService cheapestService() {
        return new CheapestServiceImp(allHotelService());
    }
}
