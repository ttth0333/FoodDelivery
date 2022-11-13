package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.MaterialEntity;
import com.tringuyen.fooddelivery.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialServiceImp implements MaterialService{
    @Autowired
    MaterialRepository materialRepository;
    @Override
    public List<MaterialEntity> getALlMaterials() {
        return materialRepository.findAll();
    }
}
