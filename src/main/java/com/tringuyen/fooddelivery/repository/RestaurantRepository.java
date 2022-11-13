package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Integer> {
    public List<RestaurantEntity> findAll();
}
