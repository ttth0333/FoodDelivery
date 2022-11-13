package com.tringuyen.fooddelivery.repository;

import com.tringuyen.fooddelivery.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

    public List<CategoryEntity> findAll();
}
