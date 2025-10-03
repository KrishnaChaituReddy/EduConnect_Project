package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;

import com.wecp.progressive.dto.UserRegistrationDTO;
import com.wecp.progressive.entity.User;
import com.wecp.progressive.repository.UserRepository;

public class UserLoginServiceImpl  {

    @Autowired
    private UserRepository userRepository;
   public  User createUser(User user) {
     return userRepository.save(user);
    }

   public  User getUserByUsername(String username) {
    return userRepository.findByUsername(username);
    }

   public void registerUser(UserRegistrationDTO userRegistrationDTO) {
       

    }

  public   User getUserDetails(int userId) {
return userRepository.findById(userId).get();
=======
import com.wecp.progressive.dto.UserRegistrationDTO;
import com.wecp.progressive.entity.User;

public class UserLoginServiceImpl {

    User createUser(User user) {
        return null;
    }

    User getUserByUsername(String username) {
        return null;
    }

    void registerUser(UserRegistrationDTO userRegistrationDTO) {

    }

    User getUserDetails(int userId) {
        return null;
>>>>>>> 8103dfae7c3cecd7dae55465017600a7daf547b4
    }
}
