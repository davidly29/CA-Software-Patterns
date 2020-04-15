package com.example.demo.controller;

import com.example.demo.dao.Customer_Account;
import com.example.demo.dao.Shopping_Cart;
import com.example.demo.service.CustomerService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@Controller
@EnableWebMvc
public class CustomerController {
    private CustomerService customerService;
    @RequestMapping("/test")
    public String welcome() {
        return "home";
    }
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/people")
    public String findAllCustomers(Model model) {
        model.addAttribute("peoples", customerService.findAll());
        return "people";
    }
    @ModelAttribute("people")
    public List<Customer_Account> allAccounts() {
        return customerService.findAll();
    }

    @PostMapping("/addCustomer")
    public String  create(@ModelAttribute("customer_account") Customer_Account customer_account, Model model) {
         customerService.save(customer_account);
        return "redirect:/test";
    }
    @GetMapping("/{id}")
    public Optional<Customer_Account> getCustomerById(@PathVariable long id) {
        return customerService.findById(id);
    }
//    @PostMapping("/addToBasket")
//    public Customer_Account addBasket(Customer_Account acc) {
//        Shopping_Cart cart = acc.getCustomerCart();
//        customerService.save(acc);
//    }
    @DeleteMapping("/remove/{id}")
    void deleteCustomer(@PathVariable Long id ) {
        customerService.deleteById(id);
    }
}
