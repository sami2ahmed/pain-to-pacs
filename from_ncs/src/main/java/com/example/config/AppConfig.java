package com.example.config;

import com.example.producer.PaymentProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class AppConfig {

    @Bean
    public PaymentProducer paymentProducer() throws IOException {
        return new PaymentProducer();
    }
}