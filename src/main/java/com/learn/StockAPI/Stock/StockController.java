package com.learn.StockAPI.Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController{

    @Autowired
    private StockService stockService;


    // GET ALL
    @RequestMapping(method = RequestMethod.GET, value = "/stock/")
    public List<Stock> getAllTransaction(){
        return stockService.getAllStocks();
    }
    // GET BY ID
    @RequestMapping(method = RequestMethod.GET, value = "/stock/{symbol}")
    public Stock getAllStocks(@PathVariable String symbol){
        return stockService.getStock(symbol);
    }



    // POST
    @RequestMapping(method = RequestMethod.POST, value = "/stock")
    public void addStock(@RequestBody Stock stock){
        stockService.addStock(stock);
    }

    // PUT
    @RequestMapping(method = RequestMethod.PUT, value = "/stock/{symbol}")
    public void updateStock(@RequestBody Stock stock,@PathVariable String symbol){
        stockService.updateStock(stock,symbol);
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/stock/{symbol}")
    public void deleteStock(@PathVariable String symbol){
        stockService.deleteStock(symbol);
    }

}
