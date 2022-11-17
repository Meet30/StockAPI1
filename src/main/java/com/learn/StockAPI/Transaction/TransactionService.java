package com.learn.StockAPI.Transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransaction(){
        List <Transaction> transactionList = new ArrayList<>();
        transactionRepository.findAll().forEach(transactionList::add);
        return transactionList;
    }

    public Transaction getTransaction(String id){
        return transactionRepository.findById(id).get();
    }

    public void addTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public void deleteTransaction(String id){
        transactionRepository.deleteById(id);
    }

    public void updateTransaction(Transaction transaction, String id){
        deleteTransaction(id);
        addTransaction(transaction);
    }
}