package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.RestaurantReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestaurantReviewRepository extends JpaRepository<RestaurantReviewEntity,Integer> {
    public List<RestaurantReviewEntity> findAll();
}
