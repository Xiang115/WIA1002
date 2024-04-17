package Lab.Lab5.Q3;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(1);
        list.add(1, 10);
        list.addLast(100);
        list.add(2, 2);

        list.remove(3);
        System.out.println();

        list.iterateForward();
        list.iterateBackward();

        System.out.printf("Size of current Doubly Linked List: %d\n", list.getSize());

        list.clear();

        System.out.printf("\nSize of current Doubly Linked List: %d\n", list.getSize());
    }
}
