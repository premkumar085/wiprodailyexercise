package com.wipro.learnproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.learnproducer.dto.Subject;
import com.wipro.learnproducer.service.LearnSubjectProducerService;


@Service
public class LearnSubjectProducerServiceImpl implements LearnSubjectProducerService {

    @Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate;

    @Override
    public void sendSubjectData(Subject subject) {
        kafkaTemplate.send("learn-subject", subject);
    }
}
