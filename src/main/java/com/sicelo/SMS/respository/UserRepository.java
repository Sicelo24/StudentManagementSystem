package com.sicelo.SMS.respository;

import com.sicelo.SMS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByPassword(String password);
}
