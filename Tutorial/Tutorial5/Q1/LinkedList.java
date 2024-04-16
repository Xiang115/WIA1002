package Tutorial.Tutorial5.Q1;

public class LinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public E addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        Node<E> temp = null;
        if (head == null) {
            head = newNode;
        } else {
            temp = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return temp.element;
    }

    public E set(int index, E e) {
        Node<E> current = head;
        Node<E> temp;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Out of bounds");
        } else if (index == size) {
            return addLast(e);
        } else if (index == 0) {
            temp = head;
            head.element = e;
            return temp.element;
        } else {
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            temp = current.next;
            current.next.element = e;
            return temp.element;
        }
    }
}
