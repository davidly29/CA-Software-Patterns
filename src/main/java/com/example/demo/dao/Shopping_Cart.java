package com.example.demo.dao;

import javax.persistence.*;

@Entity
public class Shopping_Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    public Shopping_Cart(Customer_Account cart) {
        this.cart = cart;
    }

    @OneToOne
    private Customer_Account cart;

    public Customer_Account getCart() {
        return cart;
    }

    public void setCart(Customer_Account cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
