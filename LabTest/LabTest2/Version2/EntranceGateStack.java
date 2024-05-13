package LabTest.LabTest2.Version2;

public class EntranceGateStack<gateNumber> {
    private gateNumber[] list;
    private int size;
    private int max = 10;

    @SuppressWarnings("unchecked")
    public EntranceGateStack() {
        list = (gateNumber[]) new Object[max];
        size = 0;
    }

    public void assignGate(gateNumber num) {
        if (isStackFull()) {
            System.out.println("The stack is full");
            return;
        }
        list[size++] = num;
        System.out.println("Assign " + num + " into the gate");
    }

    public void releaseGate() {
        if (isStackEmpty()) {
            System.out.println("The gate is empty");
            return;
        }
        gateNumber num = list[size - 1];
        size--;
        System.out.println("Release gate: " + num);
    }

    public void checkTopGate() {
        if (isStackEmpty()) {
            System.out.println("The gate is empty");
            return;
        }
        gateNumber num = list[size - 1];
        System.out.println("Release gate: " + num);
    }

    public boolean isStackEmpty() {
        return size == 0;
    }

    public boolean isStackFull() {
        return size == max;
    }
}
