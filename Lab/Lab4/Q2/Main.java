package Lab.Lab4.Q2;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.addFirst('a');
        list.add(1, 'b');
        list.add(2, 'c');
        list.add(3, 'd');
        list.addLast('e');

        System.out.println("The middle element: " + list.getMiddleValue());
    }
}
