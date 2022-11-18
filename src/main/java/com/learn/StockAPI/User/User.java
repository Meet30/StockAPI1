package com.learn.StockAPI.User;


import com.learn.StockAPI.Stock.Stock;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_jpa")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "balance")
    private long balance;

    @Column(name = "portfolio")
    private List<Stock> portfolio;


    public User() {
    }


}
