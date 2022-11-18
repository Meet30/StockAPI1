package com.learn.StockAPI.Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StockService {

    @Autowired
    private StockRepository stockRepository;


    public List <Stock> getAllStocks(){
        List <Stock> stockList = new ArrayList<>();
        stockRepository.findAll().forEach(stockList::add);
        return stockList;
    }

    public Stock getStock(String symbol){
        return stockRepository.findById(symbol).get();
    }

    public void addStock(Stock stock){
        stockRepository.save(stock);
    }

    public void deleteStock(String symbol){
        stockRepository.deleteById(symbol);
    }

    public void updateStock(Stock stock, String symbol){
        deleteStock(symbol);
        addStock(stock);
    }
}
