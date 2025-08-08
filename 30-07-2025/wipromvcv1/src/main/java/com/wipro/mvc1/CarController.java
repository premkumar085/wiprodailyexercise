package com.wipro.mvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.mvc1.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
     CarService carService;

    @GetMapping("/list")
    public String showCarList(Model model) {
        model.addAttribute("cars", carService.getCarList());
        return "carslist";
    }
}
