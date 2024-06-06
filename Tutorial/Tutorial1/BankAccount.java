package Tutorial.Tutorial1;

public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance; 
    }

    @Override
    public int deposit(int amount){
        if(amount < 0){
            return 0;
        }
        return (balance += amount);
    }

    @Override
    public boolean withdraw(int amount){
        if(amount < balance){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
}
