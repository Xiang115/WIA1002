package Lab.Lab5.Q2;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(){}

        public Node(E e){
            this.element = e;
        }
    }

    public SinglyLinkedList(){
        head = tail = null;
        size = 0;
    }

    public void add(E e){
        Node<E> temp = new Node<>(e);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void removeElement(E e){
        if(size==0){
            throw new IllegalStateException("List is empty");
        }
        if(head.element.equals(e)){
            head = head.next;
            size--;
            if(size==0){
                tail = null;
            }
            return;
        }
        Node<E> current = head;
        while(current.next !=null){
            if(current.next.element.equals(e)){
                current.next = current.next.next;
                size--;
                if(current.next == null){
                    tail = current;
                }
                return;
            }
            current = current.next;
        }
        throw new NoSuchElementException("Element not found");
    }

    public void printList(){
        Node<E> temp = head;
        while(temp != null){
            if(temp!=tail){
                System.out.print(temp.element + ", ");
            }else{
                System.out.print(temp.element + ".");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize(){
        return this.size;
    }

    public boolean contains(E e){
        Node<E> current = head;
        while(current != null){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace(E e, E newE){
        if(head==null){
            throw new IllegalStateException("Empty list");
        }
        Node<E> current = head;
        while(current != null){
            if(current.element.equals(e)){
                current.element = newE;
            }
            current = current.next;
        }
    }
}
