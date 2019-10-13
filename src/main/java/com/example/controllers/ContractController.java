package com.example.controllers;

import com.example.enums.Settlement;
import com.example.model.Contract;
import com.example.model.System;
import com.example.repository.ContractRepository;
import com.example.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



import java.util.Date;

@Controller
public class ContractController {

    private ContractRepository contractRepository;
    private SystemRepository systemRepository;

    @Autowired
    public ContractController(ContractRepository contractRepository, SystemRepository systemRepository) {
        this.contractRepository = contractRepository;
        this.systemRepository = systemRepository;
    }

    @GetMapping("/allContracts")
    public String showAllContracts(Model model) {
        return "allContracts";
    }

    @GetMapping("/activeContracts")
    public String showActiveContracts(Model model) {
        return "activeContracts";
    }

    @GetMapping("/removeContractForm")
    public String removeContractForm(Model model) {
        return "removeContractForm";
    }

    @GetMapping("/editContract")
    public String editContract(Model model) {
        return "editContract";
    }

    @GetMapping("/addNewContractForm")
    public String addNewContractForm(Model model) {
        return "addNewContractForm";
    }

    @RequestMapping(value = "/addContract", method = RequestMethod.POST)
    public String addContract(  @RequestParam("contractNumber") String number,
                                @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate,
                                @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate,
                                @RequestParam(name ="settlement") String settlement,
                                @RequestParam(name ="payment") double payment,
                                @RequestParam(name ="systemName") String systemName,
                                Model model) {

        System systemToCheck = systemRepository.findByName(systemName);
        if(systemToCheck != null && systemToCheck.getContract() == null){
                Contract contractToAdd = new Contract(number, startDate, endDate, Settlement.valueOf(settlement.toUpperCase()), payment, true);
                contractToAdd.setSystem(systemToCheck);
                contractRepository.save(contractToAdd);
        }

        return "redirect:/addNewContractForm";
    }

    @RequestMapping(value = "/removeContract", method = RequestMethod.POST)
    public String removeContract(@RequestParam("id") Long id, Model model){

        Contract contractToRemove = isPresentById(id);
        if (contractToRemove != null){
            contractToRemove.setStatus(false);
            contractRepository.save(contractToRemove);
            return "redirect:/dataService";
        }
        else{
            return "redirect:/removeContractForm";
        }
    }

    @RequestMapping(value = "/editContracts", method = RequestMethod.POST)
    public String editContract(@RequestParam("id") Long id, Model model){

        Contract contractToRemove = isPresentById(id);
        if (contractToRemove != null){
            contractToRemove.setStatus(false);
            contractRepository.save(contractToRemove);
            return "redirect:/dataService";
        }
        else{
            return "redirect:/removeContractForm";
        }
    }

    private Contract isPresentById(Long id){
        return contractRepository.findById(id)
                .orElse(null);
    }
}