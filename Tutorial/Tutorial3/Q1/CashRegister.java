package Week3.Tutorial3.Q1;

    /*
     * balance : double
     * 
     * AcceptMoney(double balance) : void()
     * ReturnChange(double cost) : void
     * isEnough(double cost) : boolean
     */

public class CashRegister {

    private double balance;

    public CashRegister(){
        this.balance = 0;
    }

    public void AcceptMoney(double money){
        this.balance = money;
    }

    public void ReturnChange(double cost){
            balance -= cost;
            System.out.println("This is your change: " + balance);
    }
}
