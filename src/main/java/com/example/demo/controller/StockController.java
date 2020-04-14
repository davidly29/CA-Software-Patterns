package com.example.demo.controller;

import com.example.demo.dao.Stock_Item;
import com.example.demo.service.StockItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
    private StockItemService StockService;

    public StockController(StockItemService stockService) {
        StockService = stockService;
    }
    @GetMapping
    public ResponseEntity<List<Stock_Item>> findAll() {
        return ResponseEntity.ok(StockService.findAll());
    }
    @PostMapping()
    public Stock_Item create(@RequestBody Stock_Item acc) {
        return StockService.save(acc);
    }
    @GetMapping("/{id}")
    public Optional<Stock_Item> getStockById(@PathVariable long id) {
        return StockService.findById(id);
    }
    @DeleteMapping("/remove/{id}")
    void deleteCustomer(@PathVariable Long id ) {
        StockService.deleteById(id);
    }
}
