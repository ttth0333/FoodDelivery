package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.UserDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetailEntity,Integer> {
    public List<UserDetailEntity> findAll();
}
