package LabTest.Practise.LabT1;

import java.util.ArrayList;

public class FoodStore extends ShopLot implements Comparable<FoodStore>{
    protected ArrayList<Item> menu;
    protected ArrayList<Person> Employees;

    public FoodStore(String shopname, String contactName, String contactNum){
        super(shopname, contactName, contactNum);
        menu = new ArrayList<>();
        Employees = new ArrayList<>();
    }

    public void AddEmployee(String name, String ContactNum){
        Employees.add(new Person(name, ContactNum));
    }

    public void AddMenu(String itemName, int price){
        menu.add(new Item<>(itemName, price));
    }

    public int getNoEmployees(){
        return Employees.size();
    }

    public void Display(){
        System.out.printf("ShopLot{%s\n",super.toString());
        System.out.print("menu=[");
        int lastIndexItem = menu.size()-1;
        for(Item<?> item : menu){
            if(menu.indexOf(item)==lastIndexItem){
                System.out.print(item + "], \n");
            }else{
                System.out.print(item + ",");
            }
        }
        System.out.print("employees=[");
        int lastIndexEmployee = Employees.size()-1;
        for(Person employee : Employees){
            if(Employees.indexOf(employee)==lastIndexEmployee){
                System.out.print(employee + "]}\n");
            }else{
                System.out.print(employee+ ",");
            }
        }
    }

    @Override
    public int compareTo(FoodStore o) {
        return Integer.compare(this.getNoEmployees(), o.getNoEmployees());
    }

    public String equal(FoodStore o){
        if(this.getContactName().equals(o.getContactName())){
            return "same";
        }else{
            return "different";
        }
    }
}

