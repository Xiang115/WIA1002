/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest.LabTest1;

/**
 *
 * @author Goh
 */
public class Workshop extends Event {

    private String topic;
    private String instructor;

    public Workshop(String id, String name, String date, String topic, String instructor) {
        super(id, name, date);
        this.topic = topic;
        this.instructor = instructor;
    }
    
    public String getTopic(){
        return this.topic;
    }
    
    public String getInstructor(){
        return this.instructor;
    }

    @Override
    public void displayEventDetails() {
        System.out.print("Workshop - ");
        System.out.print(super.toString()+", ");
        System.out.print("Topic: " + getTopic() +", ");
        System.out.println("Instructor: " + getInstructor());
    }
}
