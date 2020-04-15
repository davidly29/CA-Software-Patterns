package com.example.demo.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stock_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stockTitle")
    private String stockTitle;

    @Column(name = "manufacturerName")
    private String manufacturerName;

    @Column(name = "itemPrice")
    private double itemPrice;

    @Column(name = "itemCategory")
    private String itemCategory;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Item_Review> reviews;
    // TODO img src

    public Stock_Item() {
    }

    public Stock_Item(String stockTitle, String manufacturerName, double itemPrice, String itemCategory, List<Item_Review> reviews) {
        this.stockTitle = stockTitle;
        this.manufacturerName = manufacturerName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.reviews = reviews;
    }

    public List<Item_Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Item_Review> reviews) {
        this.reviews = reviews;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStockTitle() {
        return stockTitle;
    }

    public void setStockTitle(String stockTitle) {
        this.stockTitle = stockTitle;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }
}
