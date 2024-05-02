package Lecture.Lecture8;

import java.util.LinkedList;

public class LinkedQueue<T> implements QueueInterface<T>{
    LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T newEntry) {
       list.addLast(newEntry);
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }

    @Override
    public T getFront() {
        return list.peek();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list = new LinkedList<>();
    }   
}
