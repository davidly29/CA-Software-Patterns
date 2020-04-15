package com.example.demo.repo;

import com.example.demo.dao.Stock_Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Stock_Item_Repo extends JpaRepository <Stock_Item, Long> {
    public Stock_Item findByStockTitle(String title);
}
