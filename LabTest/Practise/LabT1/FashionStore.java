package LabTest.Practise.LabT1;

import java.util.ArrayList;

public class FashionStore extends ShopLot implements Comparable<FashionStore>{
        protected ArrayList<Item> clothes;
        protected ArrayList<Person> Employees;

    public FashionStore(String shopname, String contactName, String contactNum){
        super(shopname, contactName, contactNum);
        clothes = new ArrayList<>();
        Employees = new ArrayList<>();
    }

    public void AddCloth(String itemName, int price){
        clothes.add(new Item<>(itemName, price));
    }

    public void AddEmployee(String name, String ContactNum){
        Employees.add(new Person(name, ContactNum));
    }

    public int getNoEmployees(){
        return Employees.size();
    }

    public void Display(){
        System.out.printf("ShopLot{-%s\n",super.toString());
        System.out.print("clothes=[");
        int lastIndexItem = clothes.size()-1;
        for(Item<?> item : clothes){
            if(clothes.indexOf(item)==lastIndexItem){
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
    public int compareTo(FashionStore o) {
        return Integer.compare(this.getNoEmployees(), o.getNoEmployees());
    }

    public String equal(FashionStore o){
        if(this.getContactName().equals(o.getContactName())){
            return "same";
        }else{
            return "different";
        }
    }
}
