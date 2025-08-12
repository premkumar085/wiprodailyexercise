package com.wipro.carmgmt.service.impl;

import com.wipro.carmgmt.entity.Car;
import com.wipro.carmgmt.repo.CarRepo;
import com.wipro.carmgmt.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Override
    public Car save(Car car) {
        return carRepo.save(car);
    }

    @Override
    public Car update(Car car) {
        return carRepo.save(car);
    }

    @Override
    public List<Car> getAll() {
        return carRepo.findAll();
    }

    @Override
    public void delete(int id) {
        carRepo.deleteById(id);
    }
}
