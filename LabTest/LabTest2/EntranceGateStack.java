package LabTest.LabTest2;

import java.util.ArrayList;

public class EntranceGateStack<gateNumber> {
    ArrayList<gateNumber> list;
    int limit;
    int size;

    public EntranceGateStack() {
        list = new ArrayList<>();
        limit = 10;
        size = 0;
    }

    public void assignGate(gateNumber num) {
        if (isStackFull()) {
            System.out.println("The gate is full");
            return;
        }
        list.add(num);
        size++;
        System.out.println("Add " + num + " into the gate");
    }

    public void releaseGate() {
        if (isStackEmpty()) {
            System.out.println("The gate is empty");
            return;
        }
        gateNumber temp = list.remove(size - 1);
        size--;
        System.out.println("Release gate: " + temp);
    }

    public void checkTopGate() {
        if (isStackEmpty()) {
            System.out.println("The gate is empty");
            return;
        }
        System.out.println("The top gate: " + list.get(size-1));
    }

    public boolean isStackEmpty() {
        return size == 0;
    }

    public boolean isStackFull() {
        return size == limit;
    }
}
