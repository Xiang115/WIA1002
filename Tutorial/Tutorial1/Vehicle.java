package Tutorial.Tutorial1;

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
