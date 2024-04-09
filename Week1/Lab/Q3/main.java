package Week1.Lab.Q3;

public class main {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.deposit(3000);
        account.withdraw(2500);
        account.displayInfo();
    }
}
