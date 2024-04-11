package Lab.Lab2.Q3;

public class main {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<Integer>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<Integer>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<Integer>(6, 3);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println("\na equals to b? " + a.equals(b));
        System.out.println("a equals to c? " + a.equals(c));
        System.out.println("b equals to c? " + b.equals(c));

        System.out.println("\na compared to b? " + a.compareTo(b));
        System.out.println("a compared to c? " + a.compareTo(c));
        System.out.println("b compared to c? " + b.compareTo(c));
    }
}
