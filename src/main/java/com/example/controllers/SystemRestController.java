package com.example.controllers;

import com.example.model.System;
import com.example.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SystemRestController {

    private SystemRepository systemRepository;

    @Autowired
    public SystemRestController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @RequestMapping(path = "/api/allSystems", method = RequestMethod.GET)
    public List<System> getAllSystems() {
        return systemRepository.findAll();
    }
}