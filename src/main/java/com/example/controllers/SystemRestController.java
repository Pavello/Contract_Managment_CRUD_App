package com.example.controllers;

import com.example.model.System;
import com.example.service.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SystemRestController {

    private SystemServiceImpl systemService;

    @Autowired
    public SystemRestController(SystemServiceImpl systemService) {
        this.systemService = systemService;
    }

    @RequestMapping(path = "/api/allSystems", method = RequestMethod.GET)
    public List<System> getAllSystems() {
        return systemService.getAllSystems();
    }
}