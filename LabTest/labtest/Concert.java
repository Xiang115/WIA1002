/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest;

/**
 *
 * @author Goh
 */
public class Concert extends Event{
    private String bandName;
    
    public Concert(String id,String name,String date, String bandName){
        super(id,name,date);
        this.bandName = bandName;
    }
    
    public String getBandName(){
        return this.bandName;
    }
    
    @Override
    public void displayEventDetails() {
        System.out.print("Concert - ");
        System.out.print(super.toString() + ",");
        System.out.println("Band: " + getBandName());
    }    
}
