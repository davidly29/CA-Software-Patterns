package com.example.demo.controller;

import com.example.demo.dao.Stock_Item;
import com.example.demo.service.StockItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Optional;

@Controller
@EnableWebMvc
public class StockController {
    private StockItemService StockService;

    public StockController(StockItemService stockService) {
        StockService = stockService;
    }

    @RequestMapping("/addStockItem")
    public String welcome() {
        return "addStock";
    }

    @GetMapping("/stock")
    public String getAllStockItems(Model model) {
        model.addAttribute("stocks", StockService.findAll());
        return "stock";
    }

    @PostMapping("/addStock")
    public String create(@ModelAttribute("stock_item") Stock_Item acc) {
        StockService.save(acc);
        return "redirect:/test";
    }
    @GetMapping("/getStockItem/{id}")
    public String getStockById(@PathVariable int id, Model model) {
        model.addAttribute("item", StockService.findById(id));
        return "searchStock";
    }
    @GetMapping("/workItem/{id}")
    public Optional<Stock_Item> getStockById(@PathVariable long id) {
        return StockService.findById(id);
    }

    @GetMapping("/getStockByName/{name}")
    public Stock_Item findByStockItem(@PathVariable String name) {
        return StockService.findByStockItem(name);
    }
    @GetMapping("/getall")
    public List<Stock_Item> getAllStock() {
        return StockService.findAll();
    }


    @DeleteMapping("/removeStock/{id}")
    void deleteCustomer(@PathVariable Long id ) {
        StockService.deleteById(id);
    }
}
