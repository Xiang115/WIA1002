package Week1.Tutorial;

public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance; 
    }

    public int deposit(int amount){
        return (balance += amount);
    }

    public boolean withdraw(int amount){
        if(amount < balance){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
}
