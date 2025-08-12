package com.wipro.usermgmt.service.impl;

import com.wipro.usermgmt.dto.Mobile;
import com.wipro.usermgmt.repo.MobileRepository;
import com.wipro.usermgmt.service.MobileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
     MobileRepository repo;

    public void save(Mobile mobile) {
        repo.save(mobile);
    }

    public Mobile findById(int id) {
        return repo.findById(id);
    }

    public Collection<Mobile> findAll() {
        return repo.findAll();
    }

    public void update(Mobile mobile) {
        repo.update(mobile);
    }

    public void delete(int id) {
        repo.delete(id);
    }
}

