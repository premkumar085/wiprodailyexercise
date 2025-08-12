package com.wipro.carmgmt.controller;

import com.wipro.carmgmt.entity.Car;
import com.wipro.carmgmt.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public String create(@RequestBody Car car) {
        carService.save(car);
        return "Car created successfully";
    }

    @PutMapping
    public String update(@RequestBody Car car) {
        carService.update(car);
        return "Car updated successfully";
    }

    @GetMapping
    public List<Car> getAll() {
        return carService.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        carService.delete(id);
        return "Car deleted successfully";
    }
}
