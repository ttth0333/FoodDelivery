package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public List<UserEntity> findAll();

    public List<UserEntity> findByEmailAndPassword(String email, String password);
}
