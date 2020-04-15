package com.example.demo.repo;

import com.example.demo.dao.Admin_Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Admin_Repo extends JpaRepository<Admin_Account, Long> {
    public Admin_Account findByUsername(String username);
}
