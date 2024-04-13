package Lab.Lab4.Q2;

public class LinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        } else if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = newNode;
            (current.next).next = temp;
            size++;
        }
    }

    public E getMiddleValue(){
        Node<E> current = head;
        for(int i=1;i<(size+1)/2;i++)
            current = current.next;
        return current.element;
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E e){
            this.element = e;
        }
    }
}
