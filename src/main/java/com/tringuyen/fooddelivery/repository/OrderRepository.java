package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

    public List<OrderEntity> findAll();

}
