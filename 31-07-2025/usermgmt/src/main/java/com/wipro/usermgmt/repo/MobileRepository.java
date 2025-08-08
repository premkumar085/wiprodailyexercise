package com.wipro.usermgmt.repo;

import com.wipro.usermgmt.dto.Mobile;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MobileRepository {
    private Map<Integer, Mobile> mobileStore = new HashMap<>();

    public void save(Mobile mobile) {
        mobileStore.put(mobile.getId(), mobile);
    }

    public Mobile findById(int id) {
        return mobileStore.get(id);
    }

    public Collection<Mobile> findAll() {
        return mobileStore.values();
    }

    public void update(Mobile mobile) {
        mobileStore.put(mobile.getId(), mobile);
    }

    public void delete(int id) {
        mobileStore.remove(id);
    }
}


