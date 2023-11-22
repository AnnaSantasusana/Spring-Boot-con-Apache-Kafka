package com.kafka.consumer.controller;

import com.kafka.consumer.service.MessageConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private MessageConsumerService messageService;

    @GetMapping("/consume-message")
    public ResponseEntity<String> consumeMessage() {
        String lastReceivedMessage = messageService.getLastReceivedMessage();

        if (lastReceivedMessage != null) {
            return ResponseEntity.ok("Last received message: " + lastReceivedMessage);
        } else {
            return ResponseEntity.ok("No message received yet");
        }
    }

}

