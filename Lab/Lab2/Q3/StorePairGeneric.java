package Lab.Lab2.Q3;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o) {
        StorePairGeneric<T> that = (StorePairGeneric<T>)o;
       return this.first.equals(that.getFirst());
        //return this.first.equals(((StorePairGeneric<T>) o).getFirst());
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return this.first.compareTo(o.getFirst());
    }
}
