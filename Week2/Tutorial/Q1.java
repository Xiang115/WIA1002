package Week2.Tutorial;

public class Q1 {
    //Q1
    public static void main(String[] args) {
        Container<Integer> integers = new Container<>();
        Container<String> strings = new Container<>();

        integers.add(50);
        strings.add("Java");
        System.out.println(integers.retrieve());
        System.out.println(strings.retrieve());
    }
}
