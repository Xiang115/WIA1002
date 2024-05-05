package LabTest.Practise.LabT1;

public class Person{
    private String ContactName;
    private String ContactNumber;

    public Person(String ContactName, String ContactNumber){
        this.ContactName = ContactName;
        this.ContactNumber = ContactNumber;
    }

    public String getName(){
        return this.ContactName;
    }

    public String toString(){
        return String.format("Person{name=-%s, contactNo=-%s}", this.ContactName,this.ContactNumber);
    }
}
