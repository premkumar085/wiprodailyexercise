package com.wipro.mvc1.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mvc1.repo.CarRepo;
import com.wipro.mvc1.service.CarService;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Override
    public List<String> getCarList() {
        return carRepo.getCarList();
    }
}

