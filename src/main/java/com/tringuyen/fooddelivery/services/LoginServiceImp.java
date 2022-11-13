package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.UserDetailEntity;
import com.tringuyen.fooddelivery.entity.UserEntity;
import com.tringuyen.fooddelivery.repository.UserDetailRepository;
import com.tringuyen.fooddelivery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<UserDetailEntity> getAllUserDetails() {
        return userDetailRepository.findAll();
    }

    @Override
    public boolean checkLogin(String email, String password) {
        List<UserEntity> list = userRepository.findByEmailAndPassword(email,password);
        return list.size() > 0;
    }


}
