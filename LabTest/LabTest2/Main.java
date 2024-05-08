package LabTest.LabTest2;

//Error handling is quite important
// you need to suppose the user have 0 knowledge of cs
// your system need to handle various case and print out

public class Main {
    public static void main(String[] args) {
        EntranceGateStack<Integer> stack = new EntranceGateStack<>();
        RideWaitingQueue<Integer>  queue = new RideWaitingQueue<>();

        //Simulate visitor arrivals and departures at entrance gates 
        stack.assignGate(1001);
        stack.assignGate(1002);
        stack.assignGate(1003);
        stack.checkTopGate();
        stack.releaseGate();
        stack.checkTopGate();

        //Simulate visitors joining and completing rides
        queue.joinWaitingLine(2001);
        queue.joinWaitingLine(2002);
        queue.joinWaitingLine(2003);
        queue.completeRide();
        queue.viewNextTicketNumber();
    }
}
