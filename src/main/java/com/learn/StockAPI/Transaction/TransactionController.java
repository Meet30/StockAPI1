package com.learn.StockAPI.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

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
