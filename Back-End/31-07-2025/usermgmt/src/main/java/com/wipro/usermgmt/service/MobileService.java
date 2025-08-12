package com.wipro.usermgmt.service;

import com.wipro.usermgmt.dto.Mobile;
import java.util.Collection;

public interface MobileService {
    void save(Mobile mobile);
    Mobile findById(int id);
    Collection<Mobile> findAll();
    void update(Mobile mobile);
    void delete(int id);
}



