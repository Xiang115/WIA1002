package LabTest.LabTest2.Version2;

public class RideWaitingQueue<ticketNumber> {
    private class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    private Node<ticketNumber> head;
    private Node<ticketNumber> tail;
    int size;
    int limit;

    public RideWaitingQueue() {
        head = tail = null;
        size = 0;
        size = 10;
    }

    public void joinWaitingLine(ticketNumber num) {
        if(isQueueFull()){
            System.out.println("The queue is full");
            return;
        }
        Node<ticketNumber> temp = new Node<>(num);
        if (head == null) {
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
        System.out.println(num + " join the waiting line");
    }

    public void completeRide(){
        ticketNumber temp = head.item;
        if(isQueueEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        if(size == 1){
            head = tail = null;        
        }else{
            head = head.next;
        }
        size--;
        System.out.println(temp + " complete the ride");
    }

    public void viewNextTicketNumber(){
        ticketNumber temp = head.item;
        if(isQueueEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("Next ticket is: " + temp);
    }

    public boolean isQueueEmpty() {
        return size == 0;
    }

    public boolean isQueueFull() {
        return size == limit;
    }
}
