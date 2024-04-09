package Week2.Lab.Q5;

public class FindMax {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {
            new Circle(3),
            new Circle(2.9),
            new Circle(5.9)
        };

        System.out.println("The maximum value of a: " + max(a));
        System.out.println("The maximum value of b: " + max(b));
        System.out.println("The maximum value of c: " + max(c));
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];

        for(E that : list){
            if(that.compareTo(max)>0)
                max = that;
        }
        return max;
    } 
}
