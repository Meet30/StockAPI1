package com.learn.StockAPI.Stock;


import javax.persistence.*;

@Entity
@Table(name = "stock_jpa")
public class Stock{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private int stock_id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "price")
    private long price;


    public Stock() {
    }

}
