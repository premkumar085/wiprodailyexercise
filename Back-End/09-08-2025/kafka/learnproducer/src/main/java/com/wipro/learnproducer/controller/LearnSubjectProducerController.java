package com.wipro.learnproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.learnproducer.dto.Subject;
import com.wipro.learnproducer.service.LearnSubjectProducerService;

@RestController
@RequestMapping("/subject")
public class LearnSubjectProducerController {

    @Autowired
    LearnSubjectProducerService subjectService;

    @PostMapping
    public void sendSubjectData(@RequestBody Subject subject) {
        subjectService.sendSubjectData(subject);
    }
}
