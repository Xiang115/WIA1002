package Lab.Lab6.Q1;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public MyStack(){}

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Stack: " + list.toString();
    }

    public boolean search(E o){
        for(E item : list){
            if(item.equals(o))
                return true;
        }
        return false;
    }
}
