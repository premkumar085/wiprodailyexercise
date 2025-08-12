package com.wipro.entity.relationdemo1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.entity.relationdemo1.entity.Person;
import com.wipro.entity.relationdemo1.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public void save(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }
}
