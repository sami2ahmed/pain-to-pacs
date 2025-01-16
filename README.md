# pain-to-pacs
using kstreams for mapping PAIN to PACS formatted data

## Note on application properties
Within src/resources dir create application.properties files with your own values i.e. 
```
spring.kafka.bootstrap-servers=your-confluent-cloud-bootstrap-servers
spring.kafka.properties.sasl.mechanism=PLAIN
spring.kafka.properties.security.protocol=SASL_SSL
spring.kafka.properties.sasl.jaas.config=org.apache.kafka.common.security.plain.PlainLoginModule required username="your-username" password="your-password";
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer
```

## dataflow 
Customer initiates payment (PAIN.001) -->
NCS pain001_jaxb.txt unmarshals XML into java objects via XSD schema -->
paymentMapper.java extracts relevant data, prepares for ISO compliant format from PAIN 001 message by referencing--> 
transactoionDto.txt  (transactionDTO.json) 

