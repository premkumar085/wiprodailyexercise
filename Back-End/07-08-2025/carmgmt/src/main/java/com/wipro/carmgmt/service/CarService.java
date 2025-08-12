package com.wipro.carmgmt.service;

import com.wipro.carmgmt.entity.Car;
import java.util.List;

public interface CarService {
    Car save(Car car);
    Car update(Car car);
    List<Car> getAll();
    void delete(int id);
}
