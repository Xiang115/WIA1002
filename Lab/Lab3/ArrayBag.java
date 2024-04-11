package Lab.Lab3;

public class ArrayBag<T> implements BagInterface<T> {
    private T[] bag;
    private final static int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[capacity];
        bag = temp;
        numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isFull() {
        return numberOfEntries >= bag.length;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public boolean add(T newEntry) {
        if (!isFull()) {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
        return false;
    }

    public T remove() {
        if (!isEmpty()) {
            T result = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
            return result;
        }
        return null;
    }

    public boolean remove(T anEntry) {
        int index = -1;
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false;

        bag[index] = bag[--numberOfEntries];
        bag[numberOfEntries] = null;
        return true;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        bag = (T[]) new Object[bag.length];
        numberOfEntries = 0;
    }

    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        for (int i = 0; i < bag.length; i++) {
            if (anEntry.equals(bag[i])) {
                freq++;
            }
        }
        return freq;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        for (T item : bag) {
            if (anEntry.equals(item))
                found = true;
        }
        return found;
    }

    public T[] toArray() {
        T[] temp = bag.clone();
        return temp;
    }

    public BagInterface<T> union(BagInterface<? extends T> another) {
        T[] bag2 = another.toArray();
        BagInterface<T> newBag = new ArrayBag<>(getCurrentSize() + another.getCurrentSize());
        for (int i = 0; i < numberOfEntries; i++) {
            newBag.add(bag[i]);
        }
        for (T item : bag2) {
            newBag.add(item);
        }
        return newBag;
    }

    public BagInterface<T> intersection(BagInterface<? extends T> another) {
        T[] bag2 = another.toArray();
        BagInterface<T> newBag = new ArrayBag<>(numberOfEntries);
        for (int i = 0; i < numberOfEntries; i++) {
            for (int j = 0; j < bag2.length; j++) {
                if (bag[i].equals(bag2[j])) {
                    newBag.add(bag[i]);
                    bag2[j] = null;
                    break;
                }
            }
        }
        return newBag;
    }

    public BagInterface<T> difference(BagInterface<? extends T> another) {
        T[] bag2 = another.toArray();
        BagInterface<T> newBag = new ArrayBag<>(numberOfEntries);
        for (int i = 0; i < numberOfEntries; i++) {
            newBag.add(bag[i]);
        }
        for (T item : bag2) {
            newBag.remove(item);
        }
        return newBag;
    }
}
