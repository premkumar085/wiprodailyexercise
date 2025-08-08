package com.wipro.entity.relationdemo1.service;

import java.util.List;
import com.wipro.entity.relationdemo1.entity.Person;

public interface PersonService {
    void save(Person person);
    List<Person> findAll();
}
