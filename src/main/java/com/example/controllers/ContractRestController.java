package com.example.controllers;

import com.example.model.Contract;
import com.example.repository.ContractRepository;
import com.example.service.ContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractRestController {

    private ContractServiceImpl contractService;

    @Autowired
    public ContractRestController(ContractServiceImpl contractService){
        this.contractService = contractService;
    }

    @RequestMapping(path="/api/allContracts", method= RequestMethod.GET)
    public List<Contract> getAllContracts(){
        return contractService.getAllContracts();
    }

    @RequestMapping(path="/api/activeContracts", method = RequestMethod.GET)
    public List<Contract> getActiveContracts(){
        return contractService.getActiveContracts();
    }
}
