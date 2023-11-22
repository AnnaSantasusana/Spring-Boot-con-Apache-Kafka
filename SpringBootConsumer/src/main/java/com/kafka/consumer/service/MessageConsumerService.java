package com.kafka.consumer.service;

import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    private String lastReceivedMessage;

    public void setLastReceivedMessage(String message) {
        this.lastReceivedMessage = message;
    }

    public String getLastReceivedMessage() {
        return lastReceivedMessage;
    }
}

