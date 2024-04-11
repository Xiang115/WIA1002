package Week2.Tutorial2;

import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        numOfCars.add(2);
        milesPerHour.add(4.00);
        display(numOfCars);
        display(milesPerHour);
    }

    //why ? should follow extends T
    public static <T> void display(ArrayList<? extends T> arr){
        for(T element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
