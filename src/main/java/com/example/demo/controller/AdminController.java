package com.example.demo.controller;

import com.example.demo.dao.Admin_Account;
import com.example.demo.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping
    public ResponseEntity<List<Admin_Account>> findAll() {
        return ResponseEntity.ok(adminService.findAll());
    }
    @PostMapping()
    public Admin_Account create(@RequestBody Admin_Account acc) {
        return adminService.save(acc);
    }
    @GetMapping("/{id}")
    public Optional<Admin_Account> getAdminById(@PathVariable long id) {
        return adminService.findById(id);
    }
    @DeleteMapping("/remove/{id}")
    void deleteAdmin(@PathVariable Long id ) {
        adminService.deleteById(id);
    }
}
