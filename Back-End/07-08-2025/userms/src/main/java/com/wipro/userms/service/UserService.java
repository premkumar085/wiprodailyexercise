package com.wipro.userms.service;

import com.wipro.userms.entity.User;
import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    void update(User user);
    void delete(int id);
}
