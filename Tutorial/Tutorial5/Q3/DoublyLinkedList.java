package Tutorial.Tutorial5.Q3;

import Lab.Lab4.Q1.Node;

public class DoublyLinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    private static class Node<E> {
        E e;
        Node<E> next;
        Node<E> prev;

        public Node(E e, Node next, Node prev) {
            this.e = e;
            this.next = next;
            this.prev = prev;
        }

        public Node(E e) {
            this(e, null, null);
        }
    }

    public DoublyLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(E e) {
        this.add(size, e);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if(tail==null){
            tail = newNode;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null, tail);
        if(tail!=null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node<E> insert = new Node<>(e, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        }
    }

    public void display() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.e + " ");
            current = current.next;
        }
        System.out.println(); 
    }
}
