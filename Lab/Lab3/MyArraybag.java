// package Lab.Lab3;

// public class MyArraybag<T> implements BagInterface<T> {
//     private T[] bag;
//     private final static int DEFAULT_CAPACITY = 25;
//     private int numberOfEntries;

//     public MyArraybag() {
//         this(DEFAULT_CAPACITY);
//     }

//     public MyArraybag(int capacity) {
//         @SuppressWarnings("unchecked")
//         T[] temp = (T[]) new Object[capacity];
//         bag = temp;
//         numberOfEntries = 0;
//     }

//     public int getCurrentSize() {
//         return numberOfEntries;
//     }

//     public boolean isFull() {
//         return numberOfEntries >= bag.length;
//     }

//     public boolean isEmpty() {
//         return numberOfEntries == 0;
//     }

//     public boolean add(T newEntry) {
//         if (!isFull() && !isEmpty()) {
//             bag[numberOfEntries] = newEntry;
//             numberOfEntries++;
//             return true;
//         }
//         return false;
//     }

//     public T remove() {
//         if (!isEmpty()) {
//             T result = bag[numberOfEntries - 1];
//             bag[numberOfEntries - 1] = null;
//             numberOfEntries--;
//             return result;
//         }
//         return null;
//     }

//     public boolean remove(T anEntry) {
//         if(!isEmpty()){
            
//         }
//     }

//     public boolean contains(T anEntry){
//         boolean found = false;
//         for(T item)
//         return found;
//     }
// }
