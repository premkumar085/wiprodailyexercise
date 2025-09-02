package com.wipro.usermgmtv2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.usermgmtv2.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmailIdAndPassWord(String emailId, String passWord);
    User findByEmailId(String emailId);
}
