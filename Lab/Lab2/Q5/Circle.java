package Lab.Lab2.Q5;

public class Circle implements Comparable<Circle>{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public int compareTo(Circle o){
        if(this.radius > o.radius){
            return 1;
        }else if(this.radius < o.radius){
            return -1;
        }else{
            return 0;
        }
    }

    //Another easier way
    // return Double.compare(this.radius,o.radius);
    /*
     * it is same as the above function 
    */

    public String toString(){
        return Double.toString(radius);
    }
}
