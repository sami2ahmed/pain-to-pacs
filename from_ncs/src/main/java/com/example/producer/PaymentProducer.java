package com.example.producer;

import com.example.model.Document;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class PaymentProducer {

    private final Logger logger = LoggerFactory.getLogger(PaymentProducer.class);

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    private List<Document> records;

    @PostConstruct
    public void init() throws IOException {
        logger.info(".ctor() - Read pain001.xml to memory.");
        try (InputStream inputStream = this.getClass().getResourceAsStream("/pain001.xml")) {
            XmlMapper xmlMapper = new XmlMapper();
            Document document = xmlMapper.readValue(inputStream, Document.class);
            this.records = List.of(document);
        }
    }

    public void sendPayments() {
        for (Document document : records) {
            kafkaTemplate.send("payment-topic", document);
            logger.info("Sent payment info: {}", document);
        }
    }
}