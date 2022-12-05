package com.learn.StockAPI.Transaction;

import com.learn.StockAPI.Stock.Stock;
import com.learn.StockAPI.User.User;

import javax.persistence.*;

@Entity
@Table(name = "transactions_jpa")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private int transaction_id;

    @Column(name = "quantity")
    private int quantity;


    @ManyToOne(cascade = CascadeType.ALL)
    private Stock stock;

    @ManyToOne
    private User user;

    public Transaction(){}

    public Transaction(int transaction_id, int quantity, Stock stock, User user) {
        this.transaction_id = transaction_id;
        this.quantity = quantity;
        this.stock = stock;
        this.user = user;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
