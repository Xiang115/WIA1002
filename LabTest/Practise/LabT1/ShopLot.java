package LabTest.LabT1;

public class ShopLot{
    private String ShopName;
    private Person Contact;

    public ShopLot(String ShopName, String ContactName, String ContactNum){
        this.ShopName = ShopName;
        Contact = new Person(ContactName, ContactNum);
    }

    public String getShopName(){
        return this.ShopName;
    }

    public String getContactName(){
        return this.Contact.getName();
    }

    public String toString(){
        return String.format("shopName=-%s, contact=-%s", ShopName,Contact);
    }
}
