package com.example.demo.dao;

import javax.persistence.*;

@Entity
public class Customer_Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "shipAddress")
    public String shippingAddress;
    @Column(name = "name")
    public String name;

    @OneToOne
    private Shopping_Cart customerCart;

    public void setId(int id) {
        this.id = id;
    }

    public Customer_Account(String shippingAddress, String name, Shopping_Cart customerCart) {
        this.shippingAddress = shippingAddress;
        this.name = name;
        this.customerCart = customerCart;
    }

    public Customer_Account() {
    }

    public Shopping_Cart getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(Shopping_Cart customerCart) {
        this.customerCart = customerCart;
    }

    public long getId() {
        return id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
