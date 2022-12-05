package com.learn.StockAPI.Transaction;

import com.learn.StockAPI.Stock.Stock;
import com.learn.StockAPI.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

//    // INIT
//    @RequestMapping(method = RequestMethod.GET, value = "/transactions/init")
//    public void init(){
//        Stock tempStock = new Stock(2,"ITC",1000);
//        User tempUser = new User(3,999,new HashSet<Stock>(),new HashSet<Transaction>());
//        Transaction temp = new Transaction(30,25,tempStock,tempUser);
//        transactionService.addTransaction(temp);
//    }

    // GET REQUEST
    @RequestMapping(method = RequestMethod.GET, value = "/transactions")
    public List<Transaction> getAllTransaction(){
        return transactionService.getAllTransaction();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/transactions/{transaction_id}")
    public Transaction getTransaction(@PathVariable int transaction_id){
        return transactionService.getTransaction(transaction_id);
    }

    // POST REQUEST
    @RequestMapping(method = RequestMethod.POST, value = "/transactions")
    public void addTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }

    // DELETE REQUEST
    @RequestMapping(method = RequestMethod.DELETE, value = "/transactions/{transaction_id}")
    public void deleteTransaction(@PathVariable int transaction_id){
        transactionService.deleteTransaction(transaction_id);
    }

    // PUT REQUEST
    @RequestMapping(method = RequestMethod.PUT, value = "/transactions/{transaction_id}")
    public  void updateTransaction(@RequestBody Transaction transaction, @PathVariable int transaction_id){
        transactionService.updateTransaction(transaction,transaction_id);
    }
}
