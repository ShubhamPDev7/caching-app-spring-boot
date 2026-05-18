package com.example.cachingapp.services;

import com.example.cachingapp.entities.Employee;
import com.example.cachingapp.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
