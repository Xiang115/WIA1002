package Week1.Tutorial1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Goh
 */

abstract class Vehicle {
    private final double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    } 

    abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }    

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed)
            accelerate();
    }

    public static void main(String[] args) {
        //no
    }
}
