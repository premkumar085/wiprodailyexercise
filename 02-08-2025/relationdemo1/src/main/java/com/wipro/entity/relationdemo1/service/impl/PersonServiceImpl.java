package com.wipro.entity.relationdemo1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.entity.relationdemo1.entity.Person;
import com.wipro.entity.relationdemo1.repo.PersonRepo;
import com.wipro.entity.relationdemo1.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepo personRepo;

    @Override
    public void save(Person person) {
        personRepo.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }
}
