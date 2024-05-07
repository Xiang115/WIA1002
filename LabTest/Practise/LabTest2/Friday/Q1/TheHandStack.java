package LabTest.Practise.LabTest2.Friday.Q1;

import java.util.ArrayList;

public class TheHandStack<TH> {
    private final ArrayList<TH> stack = new ArrayList<>();

    public void push(TH element) {
        stack.add(element);
    }

    public TH pop() {
        return stack.remove(0); // bottommost
    }

    public TH peek() {
        return stack.get(0); // bottommost
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
