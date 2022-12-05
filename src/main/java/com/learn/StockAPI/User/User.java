package com.learn.StockAPI.User;


import com.learn.StockAPI.Stock.Stock;
import com.learn.StockAPI.Transaction.Transaction;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_jpa")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "balance")
    private long balance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set <Stock> portfolio;

    @OneToMany(cascade = CascadeType.ALL)
    private Set <Transaction> trasactions;


    public User() {
    }

    public User(int user_id, long balance, Set<Stock> portfolio, Set<Transaction> trasactions) {
        this.user_id = user_id;
        this.balance = balance;
        this.portfolio = portfolio;
        this.trasactions = trasactions;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Set<Stock> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Set<Stock> portfolio) {
        this.portfolio = portfolio;
    }

    public Set<Transaction> getTrasactions() {
        return trasactions;
    }

    public void setTrasactions(Set<Transaction> trasactions) {
        this.trasactions = trasactions;
    }
}
