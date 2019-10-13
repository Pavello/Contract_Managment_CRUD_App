package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/home")
    public String viewHomePageFromMenu(Model model) {
        return "home";
    }

    @GetMapping("/viewData")
    public String viewDataPage(Model model) {
        return "viewData";
    }

    @GetMapping("/dataService")
    public String viewDataService(Model model) {
        return "dataService";
    }

    @GetMapping("/about")
    public String viewAbout(Model model) {
        return "about";
    }


}

