package service;

import entity.Transaction;
import entity.TransactionTime;
import repo.TransactionRepo;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private TransactionRepo repo;

    public TransactionService() {
        this.repo = new TransactionRepo();
    }

    public boolean addTransaction(Transaction transaction) {
        //TODO: check!!
        if (TransactionVerification.checkTransaction(transaction)){
            repo.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public List<Transaction> getAll() {
        //TODO: check!!
        return repo.getAll();
    }

    public boolean editTransaction(Long id, Transaction transactionFromMenu) {
        if (repo.removeById(id)) {
            repo.addTransaction(transactionFromMenu);
            return true;
        }
        return false;
    }

    public List<Transaction> getTransactionsByTime(TransactionTime transactionTime) {
        List<Transaction> transactionsByTime = new ArrayList<>();
        for (Transaction transactionFromRepo : repo.getAll()) {
            if (transactionFromRepo.getTime().isInside(transactionTime)) {
                transactionsByTime.add(transactionFromRepo);
            }
        }
        return transactionsByTime;
    }

    public Transaction getTransactionById(Long id) {
        return repo.getTransactionById(id);
    }
}
