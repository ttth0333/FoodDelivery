package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaterialRepository extends JpaRepository<MaterialEntity,Integer> {
    public List<MaterialEntity> findAll();
}
