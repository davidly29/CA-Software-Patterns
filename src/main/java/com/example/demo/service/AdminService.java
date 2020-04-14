package com.example.demo.service;

import com.example.demo.dao.Admin_Account;
import com.example.demo.repo.Admin_Repo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private Admin_Repo admin_repo;

    public AdminService(Admin_Repo admin_repo) {
        this.admin_repo = admin_repo;
    }
    public List<Admin_Account> findAll() {
        return admin_repo.findAll();
    }

    public Admin_Account save(Admin_Account acc) {
        return admin_repo.save(acc);
    }

    public Optional<Admin_Account> findById(long id) {return admin_repo.findById(id);}

    public void deleteById(long id) { admin_repo.deleteById(id);}
}
