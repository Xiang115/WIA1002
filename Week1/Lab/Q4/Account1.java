package Week1.Lab.Q4;

import java.util.ArrayList;
import java.util.Date;

import Week1.Lab.Q3.Account;

public class Account1 extends Account {
    private String name;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public void deposit(double amount,String description){
        setBalance(getBalance() + amount);
        transactions.add(new Transaction('D', amount, getBalance(), description));
    }

    public void withdraw(double amount, String description){
        setBalance(getBalance() - amount);
        transactions.add(new Transaction('W', amount,  getBalance(), description));
    }

    public void TransactionSummary(){
        System.out.printf(
            "============================\nAccount Summary for %s\n============================\nBalance: $%s\nInterest Rate: %s%s\n\n",
            this.name, super.getBalance(), super.getMonthlyInterestRate() * 12 * 100, "%"
        );
        for(Transaction transaction: transactions){
            System.out.println(transaction.getTransactionData());
        }
    }
}
