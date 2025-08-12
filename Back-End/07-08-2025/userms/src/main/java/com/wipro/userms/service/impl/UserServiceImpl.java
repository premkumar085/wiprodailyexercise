package com.wipro.userms.service.impl;

import com.wipro.userms.dto.NotificationRequest;
import com.wipro.userms.entity.User;

import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.NotificationClient;
import com.wipro.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private NotificationClient notificationClient;

    @Override
    public void save(User user) {
        userRepo.save(user);
        notify("Created", user);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void update(User user) {
        userRepo.save(user);
        notify("Updated", user);
    }

    @Override
    public void delete(int id) {
        User user = userRepo.findById(id).orElse(null);
        if (user != null) {
            userRepo.deleteById(id);
            notify("Deleted", user);
        }
    }

    private void notify(String action, User user) {
        NotificationRequest request = new NotificationRequest();
        request.setUsername(user.getUsername());
        request.setAddress(user.getAddress());
        request.setAction(action);
        notificationClient.notifyChange(request);
    }
}
