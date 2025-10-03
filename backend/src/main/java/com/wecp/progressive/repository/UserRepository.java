package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    public User findByUsername(String username);
=======

public interface UserRepository {
>>>>>>> 8103dfae7c3cecd7dae55465017600a7daf547b4
}
