package Lab.Lab5.Q3;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next, prev;

        public Node(E e) {
            this(e, null, null);
        }

        public Node(E e, Node<E> next, Node<E> prev) {
            this.element = e;
            this.next = next;
            this.prev = prev;
        }
    }

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        if (head == null) {
            head = tail = new Node<>(e);
        } else {
            Node<E> temp = new Node<>(e, head, null);
            head.prev = temp;
            head = temp;
        }
        size++;
        System.out.println("Adding: " + head.element);
    }

    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            Node<E> temp = new Node<>(e, null, tail);
            tail.next = temp;
            tail = temp;
        }
        size++;
        System.out.println("Adding: " + tail.element);
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
            for (int i = 0; i < index; i++)
                temp = temp.next;
            Node<E> newNode = new Node<>(e, temp, temp.prev);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
            System.out.println("Adding: " + newNode.element);
        }
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        E element = head.element;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + element);
        return element;
    }

    public E removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        E element = tail.element;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + element);
        return element;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++)
                temp = temp.next;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.prev = null;
            temp.next = null;
            size--;
            System.out.println("deleted: " + temp.element);
            return temp.element;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void iterateForward() {
        System.out.println("iterating forward..");
        Node<E> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.element + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void iterateBackward() {
        System.out.println("iterating backward..");
        Node<E> tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.element + " ");
            tmp = tmp.prev;
        }
        System.out.println();
    }

    public void clear(){
        Node<E> temp = head;
        while(head!=null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        tail.prev = tail.next = null;
        System.out.printf("successfully clear %d node(s)\n", size);
        size = 0;
    }
}
