package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.UserDetailEntity;
import com.tringuyen.fooddelivery.entity.UserEntity;

import java.util.List;

public interface LoginService {
    public List<UserEntity> getAllUsers();
    public List<UserDetailEntity> getAllUserDetails();

    public boolean checkLogin(String email, String password);
}
