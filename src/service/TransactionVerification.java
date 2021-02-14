package service;

import entity.Transaction;

public class TransactionVerification {

    private Transaction transaction;

    public static boolean checkTransaction(Transaction transaction) {
        if (transaction.getId() != null &&
                transaction.getAmount() != null &&
                transaction.getCardHolder() != null &&
                transaction.getTime() != null &&
                transaction.getTypeOfPayment() != null){
            return true;

        }
        return false;
    }
}
