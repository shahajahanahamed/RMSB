package com.techfuture.rmsb.repositories;

import com.techfuture.rmsb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> getUserByUserFirstName(String firstName);
    public List<User> getUserByUserLastName(String lastName);

}
