package com.kafka.consumer.listeners;

import com.kafka.consumer.service.MessageConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @Autowired
    private MessageConsumerService messageService;

    @KafkaListener(topics = {"pruebaKafka-Topic"}, groupId = "my-group-id")
    public void listener(String message) {
        LOGGER.info("Mensaje recibido, el mensaje es: {}", message);
        messageService.setLastReceivedMessage(message);
    }

}
