package com.example.demo.service;

import com.example.demo.dao.Stock_Item;
import com.example.demo.repo.Stock_Item_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockItemService {
    @Autowired
   private Stock_Item_Repo itemRepo;

    public StockItemService(Stock_Item_Repo itemRepo) {
        this.itemRepo = itemRepo;
    }
    public List<Stock_Item> findAll() {
        return itemRepo.findAll();
    }

    public Stock_Item save(Stock_Item acc) {
        return itemRepo.save(acc);
    }

    public Optional<Stock_Item> findById(long id) {return itemRepo.findById(id);}

    public void deleteById(long id) { itemRepo.deleteById(id);}
}
