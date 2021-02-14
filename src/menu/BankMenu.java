package menu;

import entity.*;
import repo.TransactionRepo;
import service.TransactionService;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class BankMenu {

    private TransactionRepo transactionRepo;
    private TransactionService transactionService;
    Scanner in;

    public BankMenu(){

        transactionService = new TransactionService();
        printBank();
    }

    private void printBank() {
        System.out.println("Привет! Ты попал в хуевый банк!");
        pressUserFromConsole();
    }

    private void pressUserFromConsole() {
        System.out.println("1. Добавить платёж");
        System.out.println("2. Вывести все платежи");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        if (userInput == 1){
            Transaction transaction = userInputFromConsole();
            transactionService.addTransaction(transaction);
        }

        if (userInput == 2){
            printTransactions(transactionService.getAll());
        }
        pressUserFromConsole();
    }

    private void printTransactions(List<Transaction> all) {
        for (Transaction transaction : all){
            System.out.println(transaction.toString());
        }
    }

    private Transaction userInputFromConsole() {
        Scanner in = new Scanner(System.in);
        Transaction transaction = new Transaction();

        transaction.setId(new Id());
        System.out.println("Какая у вас карта?(Visa/MasterCard)");
        transaction.setTypeOfPayment(in.next());
        System.out.println("Введите валюту и сумму перевода: ");
        transaction.setAmount(new Amount(in.next(), in.nextDouble()));
        System.out.println("Ваше имя и фамилия");
        transaction.setCardHolder(new CardHolder(in.next(), in.next()));
        System.out.println("Введите дату хранения платежа: ");
        transaction.setTime(new TransactionTime(new GregorianCalendar(2021, 1, 31),
                (new GregorianCalendar(in.nextInt(), in.nextInt(), in.nextInt()))));

        return transaction;
    }
}
