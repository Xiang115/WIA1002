package LabTest.Practise.LabTest2.SetA;

import java.util.ArrayList;

public class Stack<E extends Person> {
    private ArrayList<Person> list = new ArrayList<>();
    protected String stack_name;

    public Stack(String name) {
        this.stack_name = name;
    }

    public void push(String name, int age) {
        Person o = new Person(name, age);
        list.add(o);
    }

    public void push(String name, int age, String gender) {
        Person o = new Person(name, age, gender);
        list.add(o);
    }

    public void push(String name, int age, String gender, String occupation) {
        Person o = new Person(name, age, gender, occupation);
        list.add(o);
    }

    public void push(Person o) {
        list.add(o);
    }

    public Person pop() {
        if (isEmpty())
            return null;
        return list.remove(getSize() - 1);
    }

    public Person peek() {
        return list.get(getSize() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return;
        }
        System.out.printf("---%s---\n", stack_name);

        int num = getSize() - 1;
        for (int i = num; i >= 0; i--) {
            System.out.printf("%d %s\n", num--, list.get(i));
        }
    }
}
