package com.example.demo.service;

import com.example.demo.dao.Customer_Account;
import com.example.demo.repo.Customer_Account_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private Customer_Account_Repo customerRepo;

    public CustomerService(Customer_Account_Repo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer_Account> findAll() {
        return customerRepo.findAll();
    }

    public void save(Customer_Account acc) {
         customerRepo.save(acc);
    }

    public Optional<Customer_Account> findById(long id) {return customerRepo.findById(id);}

    public void deleteById(long id) { customerRepo.deleteById(id);}
}
