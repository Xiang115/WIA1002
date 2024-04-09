package Week1.Lab.Q3;

import java.util.Date;

public class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public int getId(int id) {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return this.balance*getMonthlyInterestRate();
    }

    public boolean withdraw(double amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            return false;
        else{
            balance += amount;
            return true;
        }
    }

    public void displayInfo() {
        System.out.println("Account info:");
        System.out.println("Balance: " + balance);
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date: " + dateCreated);
    }
}
