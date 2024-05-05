/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest.LabTest1;

/**
 *
 * @author Goh
 */
public class SportsGame extends Event {

    private String gameType;

    public SportsGame(String id, String name, String date, String gameType) {
        super(id, name, date);
        this.gameType = gameType;
    }
    
    public String getType(){
        return this.gameType;
    }

    @Override
    public void displayEventDetails() {
        System.out.print("Sports Game - ");
        System.out.print(super.toString() + ", ");
        System.out.println("Type: " + getType());
    }
}
