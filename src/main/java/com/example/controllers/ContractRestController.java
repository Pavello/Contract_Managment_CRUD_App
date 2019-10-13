package com.example.controllers;

import com.example.model.Contract;
import com.example.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractRestController {

    private ContractRepository contractRepository;

    @Autowired
    public ContractRestController(ContractRepository contractRepository){
        this.contractRepository = contractRepository;
    }

    @RequestMapping(path="/api/allContracts", method= RequestMethod.GET)
    public List<Contract> getAllContracts(){
        return contractRepository.findAll();
    }

    @RequestMapping(path="/api/activeContracts", method = RequestMethod.GET)
    public List<Contract> getActiveContracts(){
        return contractRepository.findByStatusIsTrue();
    }
}
