/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest;

/**
 *
 * @author Goh
 */

import java.util.ArrayList;

public class EventManager<T extends Event> {
    private ArrayList<T> list;  
    
    public EventManager(T obj){
        this.list = new ArrayList<>();
        list.add(obj);
    }
    
    public void addList(T obj){
        list.add(obj);
    }
    
    public void DisplayList(){
        for(T element : list){
            element.displayEventDetails();
        }
    }
}
