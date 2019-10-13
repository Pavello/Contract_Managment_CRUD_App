package com.example.controllers;

import com.example.enums.Settlement;
import com.example.model.Contract;
import com.example.model.System;
import com.example.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SystemController {

    private SystemRepository systemRepository;

    @Autowired
    public SystemController(SystemRepository systemRepository){ this.systemRepository = systemRepository;}

    @GetMapping("/systems")
    public String showAllContracts(Model model) {
        return "systems";
    }

    @GetMapping("/addNewSystemForm")
    public String addNewSystemForm(Model model) {
        return "addNewSystemForm";
    }

    @RequestMapping(value = "/addSystem", method = RequestMethod.POST)
    public String addNewSystem(@RequestParam(name ="name") String name,
                                 @RequestParam(name ="description") String description,
                                 @RequestParam(name ="technologies") String technologies,
                                 Model model) {

        System systemToAdd = new System(name, description, technologies);
        systemRepository.save(systemToAdd);

        return "redirect:/addNewSystemForm";
    }
}