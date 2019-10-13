package com.example.service;

import com.example.model.Contract;
import com.example.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    private ContractRepository contractRepository;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository){ this.contractRepository = contractRepository;}

    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public List<Contract> getActiveContracts() {
        return contractRepository.findByStatusIsTrue();
    }

    @Override
    public Contract getContractById(Long id) {
        return contractRepository.findById(id).get();
    }
}
