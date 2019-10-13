package com.example.service;

import com.example.model.Contract;

import java.util.List;

public interface ContractService {

    public List<Contract> getAllContracts();
    public List<Contract> getActiveContracts();
    public Contract getContractById(Long id);
}
