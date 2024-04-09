package Week1.Lab.Q4;

import java.util.Date;

public class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public String getTransactionData() {
        return String.format(
            "Transaction on %s\nType: %s\nAmount: %s\nBalance: $%s\nDescription: %s\n",
            this.date.toString(), (this.type == 'W') ? "Withdraw" : "Deposit", this.amount, this.balance, this.description);
    }
}
