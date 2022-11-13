package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.StatusEntity;
import com.tringuyen.fooddelivery.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusServiceImp implements StatusService{
    @Autowired
    StatusRepository statusRepository;
    @Override
    public List<StatusEntity> getALlStatus() {
        return statusRepository.findAll();
    }
}
