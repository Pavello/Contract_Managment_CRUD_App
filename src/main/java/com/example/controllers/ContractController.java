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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
    public String addContract(@RequestParam("contractNumber") String number,
                              @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate,
                              @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate,
                              @RequestParam(name = "settlement") String settlement,
                              @RequestParam(name = "payment") double payment,
                              @RequestParam(name = "systemName") String systemName,
                              Model model,
                              RedirectAttributes redirectAttr) {

        String contractMessage;
        System systemToAssignContract = systemRepository.findByName(systemName);
        if (systemToAssignContract != null && systemToAssignContract.getContract() == null) {
            Contract contractToAdd = new Contract(number, startDate, endDate, Settlement.valueOf(settlement.toUpperCase()), payment, true);
            contractToAdd.setSystem(systemToAssignContract);
            contractRepository.save(contractToAdd);
            contractMessage = "Contract added properly!";
        } else {
            contractMessage = "This system does not exist or it has already a contract assigned! Try with another one";
        }
        redirectAttr.addFlashAttribute("contractMessage", contractMessage);
        return "redirect:/addNewContractForm";
    }

    @RequestMapping(value = "/removeContract", method = RequestMethod.POST)
    public String removeContract(@RequestParam("number") String number, Model model, RedirectAttributes redirectAttr) {

        String removeContractMessage;
        Contract contractToRemove = contractRepository.findByNumber(number);
        if (contractToRemove != null) {
            contractToRemove.setStatus(false);
            contractRepository.save(contractToRemove);
            removeContractMessage = "Contract deactivated properly!";
        } else {
            removeContractMessage = "There is no contract with such a name in database!";
        }
        redirectAttr.addFlashAttribute("removeContractMessage", removeContractMessage);
        return "redirect:/removeContractForm";
    }

    @RequestMapping(value = "/editContract", method = RequestMethod.POST)
    public String editContract(@RequestParam("contractNumber") String number,
                               @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate,
                               @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate,
                               @RequestParam(name = "settlement") String settlement,
                               @RequestParam(name = "payment") double payment,
                               Model model,
                               RedirectAttributes redirectAttr) {

        String editContractMessage;
        Contract contractToEdit = contractRepository.findByNumber(number);
        if (contractToEdit != null) {
            contractToEdit.setStartDate(startDate);
            contractToEdit.setEndDate(endDate);
            contractToEdit.setSettlement(Settlement.valueOf(settlement.toUpperCase()));
            contractToEdit.setPayment(payment);
            contractRepository.save(contractToEdit);
            editContractMessage = "Contract edited properly!";
        } else {
            editContractMessage = "There is no contract with such a name in database!";
        }
        redirectAttr.addFlashAttribute("editContractMessage", editContractMessage);
        return "redirect:/editContract";
    }
}