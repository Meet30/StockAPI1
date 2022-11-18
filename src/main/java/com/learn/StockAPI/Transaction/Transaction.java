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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_stock_id")
    private Stock stock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User user;

    public Transaction(){}

}
