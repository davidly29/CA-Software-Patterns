package com.example.demo.controller;

import com.example.demo.dao.Admin_Account;
import com.example.demo.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
@EnableWebMvc
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @RequestMapping("/testAdmin")
    public String welcome() {
        return "adminLogin";
    }

    @GetMapping("/loginAdmin")
    public String login(@ModelAttribute("admin_account") Admin_Account acc) {
        if (adminService.findByUsername(acc.getUsername()) != null) {
            return "/adminPostLog";
        }
        return "/adminLogin";
    }


    @GetMapping
    public ResponseEntity<List<Admin_Account>> findAll() {
        return ResponseEntity.ok(adminService.findAll());
    }
    @PostMapping()
    public Admin_Account create(@RequestBody Admin_Account acc) {
        return adminService.save(acc);
    }
    @GetMapping("getAdmin/{id}")
    public Optional<Admin_Account> getAdminById(@PathVariable long id) {
        return adminService.findById(id);
    }
    @DeleteMapping("/removeAdmin/{id}")
    void deleteAdmin(@PathVariable Long id ) {
        adminService.deleteById(id);
    }
}
