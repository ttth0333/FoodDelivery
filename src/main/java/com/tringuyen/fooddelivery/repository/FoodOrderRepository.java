package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.FoodOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrderEntity,Integer> {
    public List<FoodOrderEntity> findAll();
}
