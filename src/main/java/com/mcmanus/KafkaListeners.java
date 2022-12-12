package com.mcmanus;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    
    @KafkaListener(topics = "mcmanus", groupId = "test")
    void listener(String data) {
        System.out.println("Listener receveived " + data + " :) ");
    }
}
