package com.wecp.progressive.service.impl;

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
    }
}
