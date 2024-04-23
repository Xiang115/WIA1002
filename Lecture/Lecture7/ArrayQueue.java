import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    private E[] arr;
    private int size;
    private int capacity;

    public ArrayQueue(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int initial){
        if(initial<0)
            throw new IllegalArgumentException();
        arr = (E[])new Object[initial];
        this.size = 0;
        this.capacity = initial;
    }

    public void enqueue(E e){
        if(size == capacity)
            resize();
        arr[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
        E item = arr[0];
        E[] temp = (E[])new Object[size()-1];
        for(int i=0;i<temp.length;i++){
            temp[i] = arr[i+1];
        }
        size--;
        arr = temp;
        return item;
    }

    public E getElement(){
        if(isEmpty())
            throw new NoSuchElementException();
        return this.arr[0];
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    @SuppressWarnings("unchecked")
    public void resize(){
        int newCapacity = capacity*2;
        E[] temp = (E[])new Object[newCapacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        capacity = newCapacity;
    }
}
