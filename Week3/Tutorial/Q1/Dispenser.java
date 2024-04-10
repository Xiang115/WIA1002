package Week3.Tutorial.Q1;

    /*
     * Item : String
     * Cost : double
     * 
     * setItem(String item) : void
     * setCost(Double cost) : void
     * getItem() : String
     * getCost() : double
     * releaseItem() : void
     */

public class Dispenser {
    
    private String Item;
    private double Cost;

    public Dispenser(String name, double cost){
        this.Item = name;
        this.Cost = cost;
    }

    public String getItem(){
        return this.Item;
    }

    public double getCost(){
        return this.Cost;
    }

    public void ReleaseItem(){
        System.out.println(Item + "is released");
    }
}
