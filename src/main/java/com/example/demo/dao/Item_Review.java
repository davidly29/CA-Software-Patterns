package com.example.demo.dao;

import javax.persistence.*;

@Entity
public class Item_Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private String userName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Item_Review review;

    public Item_Review(String comment, String userName, Item_Review review) {
        this.comment = comment;
        this.userName = userName;
        this.review = review;
    }

    public Item_Review() {
    }

    public Item_Review getReview() {
        return review;
    }

    public void setReview(Item_Review review) {
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
