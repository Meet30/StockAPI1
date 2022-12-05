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

    public Stock(int stock_id, String symbol, long price) {
        this.stock_id = stock_id;
        this.symbol = symbol;
        this.price = price;
    }

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
