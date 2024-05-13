package LabTest.LabTest2.Version1;

import java.util.Queue;
import java.util.LinkedList;

public class RideWaitingQueue<ticketNumber> {
    Queue<ticketNumber> queue;
    int limit;
    int size;

    public RideWaitingQueue() {
        limit = 10;
        size = 0;
        queue = new LinkedList<>();
    }

    public void joinWaitingLine(ticketNumber num) {
        if(isQueueFull()){
            System.out.println("The stack is full");
            return;
        }
        queue.add(num);
        size++;
        System.out.println("Add " + num + " into the waiting Line");
    }

    public void completeRide() {
        if(isQueueEmpty()){
            System.out.println("The stack is empty");
            return;
        }
        size--;
        System.out.println("Complete ride: " + queue.poll());
    }

    public void viewNextTicketNumber() {
        if(isQueueEmpty()){
            System.out.println("The stack is empty");
        }
        System.out.println("The next ticket: " + queue.peek());
    }

    public boolean isQueueEmpty() {
        return size == 0;
    }

    public boolean isQueueFull() {
        return size == limit;
    }
}
