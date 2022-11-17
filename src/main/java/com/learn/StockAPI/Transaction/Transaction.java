package com.learn.StockAPI.Transaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction_Table")
public class Transaction {
    @Id
    @Column(name = "transaction_id")
    private String id;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "order_type")
    private Character type;
    @Column(name = "trade_quantity")
    private int quantity;
    @Column(name = "at_price")
    private long price;

    public Transaction(){}

    public Transaction(String id, String symbol, Character type, int quantity, long price) {
        this.id = id;
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
