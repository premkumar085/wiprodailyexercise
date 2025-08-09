package com.wipro.learnproducer.service;

import com.wipro.learnproducer.dto.Subject;

public interface LearnSubjectProducerService {

    // void sendStockData(String stockCode, String stockPrice);
    void sendSubjectData(Subject subject);
}
