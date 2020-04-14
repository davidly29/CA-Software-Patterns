package com.example.demo.repo;

import com.example.demo.dao.Stock_Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Stock_Item_Repo extends JpaRepository <Stock_Item, Long> {
}
