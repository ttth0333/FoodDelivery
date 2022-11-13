package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.FoodAddOnsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodAddOnRepository extends JpaRepository<FoodAddOnsEntity,Integer> {
    public List<FoodAddOnsEntity> findAll();
}
