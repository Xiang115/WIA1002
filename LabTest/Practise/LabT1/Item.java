package LabTest.Practise.LabT1;

public class Item<T>{
    private T itemName;
    private T price;

    public Item(T itemName, T price){
        this.itemName = itemName;
        this.price = price;
    }

    public T getPrice(){
        return this.price;
    }

    public T getItemName(){
        return this.itemName;
    }

    public String toString(){
        return String.format("Item=-%s, price=%d", itemName, price);
    }
}
