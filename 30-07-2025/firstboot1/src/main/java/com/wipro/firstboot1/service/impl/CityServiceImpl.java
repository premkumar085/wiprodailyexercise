package com.wipro.firstboot1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstboot1.repo.CityRepo;
import com.wipro.firstboot1.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepo cityRepo;

    @Override
    public List<String> getCityList() {
        return cityRepo.getCityList();
    }
}
