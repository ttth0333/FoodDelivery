package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity,Integer> {
    public List<FoodEntity> findAll();
}
