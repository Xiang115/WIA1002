package Lecture.Lecture8;

public class Customer {
    private int arrivalTime;
    private int transactionTime;
    private int customerNumber;

    public Customer(int a, int b, int c){
        this.arrivalTime = a;
        this.transactionTime = b;
        this.customerNumber = c;
    }

    public int getArrivalTime(){
        return arrivalTime;
    }

    public int getTransactionTime(){
        return transactionTime;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }
}
