package Lab.Lab4.Q1;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();

        // (a) Append the following : a, b, c, d, e
        list.addFirst('a');
        list.add(1, 'b');
        list.add(2, 'c');
        list.add(3, 'd');
        list.addLast('e');

        // (b) Print all the elements in the list.
        list.print();

        //(c) Reverse all the elements in the list.
        list.reverse();

        //(d) Retrieve the number of elements in the list.
        System.out.println("The number of elements: " + (list.indexOf(list.getLast())+1));

        //(e) Retrieve the first and last value.
        System.out.println("The first element: " + list.getFirst());
        System.out.println("The last element: " + list.getLast());

        //(f) Delete the third value.
        list.remove(2);

        // (g) Retrieve the index location for the second and third value.
        System.out.println("The index location for the second value: " + list.get(1));
        System.out.println("The index location for the third value: " + list.get(2));

        // (h) Checks if the list has the value ‘c’.
        System.out.println("The list has the value 'c': " + list.contains('c'));

        // (i) Replace the items individually with the following: j,a,v,a
        list.set(0,'j');
        list.set(1,'a');
        list.set(2,'v');
        list.set(3,'a');
        list.print();
    }
}
