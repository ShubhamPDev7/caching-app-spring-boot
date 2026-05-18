package com.example.cachingapp.services.impl;

import com.example.cachingapp.entities.Employee;
import com.example.cachingapp.entities.SalaryAccount;
import com.example.cachingapp.services.SalaryAccountService;
import org.springframework.stereotype.Service;

@Service
public class SalaryAccountServiceImpl implements SalaryAccountService {
    @Override
    public void createAccount(Employee employee) {

    }

    @Override
    public SalaryAccount incrementBalance(Long accountId) {
        return null;
    }
}
