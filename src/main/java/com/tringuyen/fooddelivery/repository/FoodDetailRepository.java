package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.FoodDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDetailRepository extends JpaRepository<FoodDetailEntity,Integer> {
    public List<FoodDetailEntity> findAll();
}
