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

    public Transaction getTransaction(int transaction_id){
        return transactionRepository.findById(transaction_id).get();
    }

    public void addTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public void deleteTransaction(int transaction_id){
        transactionRepository.deleteById(transaction_id);
    }

    public void updateTransaction(Transaction transaction, int transaction_id){
        deleteTransaction(transaction_id);
        addTransaction(transaction);
    }
}