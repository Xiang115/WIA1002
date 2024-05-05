/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest.LabTest1;

/**
 *
 * @author Goh
 */
abstract class Event {
    private String eventId;
    private String eventName;
    private String eventDate;
    
    public Event(String id, String eventName, String eventDate){
        this.eventId = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }
    
    public String getName(){
        return this.eventName;
    }
    
    @Override
    public String toString(){
        return String.format("ID: %s, Name: %s, Date: %s", this.eventId,getName(),this.eventDate);
    }
    
    public abstract void displayEventDetails();
}
