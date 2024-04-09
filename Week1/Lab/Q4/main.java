package Week1.Lab.Q4;

public class main {
    public static void main(String[] args) {
        Account1 acc = new Account1("George", 1122, 1000);
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30,"Deposit 30");
        acc.deposit(40,"Deposit 40");
        acc.deposit(50,"Deposit 40");
        acc.withdraw(5,"Withdraw 5");
        acc.withdraw(4,"Withdraw 4");
        acc.withdraw(2,"Withdraw 2");
        acc.TransactionSummary();
    }
}
