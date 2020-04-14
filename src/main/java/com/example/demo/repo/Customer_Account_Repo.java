package com.example.demo.repo;

import com.example.demo.dao.Customer_Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Account_Repo extends JpaRepository<Customer_Account, Long> {
}
