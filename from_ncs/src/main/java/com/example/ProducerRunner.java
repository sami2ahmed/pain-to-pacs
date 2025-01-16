package com.example;

import com.example.producer.PaymentProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProducerRunner implements CommandLineRunner {

    @Autowired
    private PaymentProducer paymentProducer;

    @Override
    public void run(String... args) throws Exception {
        paymentProducer.sendPayments();
    }
}
