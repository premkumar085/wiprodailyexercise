package com.wipro.learnconsumer.consumer;

import javax.security.auth.Subject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LearnSubjectConsumer {

    @KafkaListener(topics = "learn-subject", groupId = "group_id")
    public void consume(Subject msg) {
        System.out.println("Consumed Subject: " + msg);
    }
}
