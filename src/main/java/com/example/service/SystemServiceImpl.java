package com.example.service;

import com.example.model.System;
import com.example.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    private SystemRepository systemRepository;

    @Autowired
    public SystemServiceImpl(SystemRepository systemRepository){
        this.systemRepository = systemRepository;
    }

    @Override
    public List<System> getAllSystems() {
        return systemRepository.findAll();
    }
}

