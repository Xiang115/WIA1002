package Lab.Lab4.Q1;

public class MyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        } else if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = newNode;
            (current.next).next = temp;
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
        }
    }

    public void removeFirst() {
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void removeLast() {
        Node<E> current = head;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of the bound");
        } else if (index == 0) {
            return getFirst();
        } else if (index == size - 1) {
            return getLast();
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
            return current.element;
        }
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        int index = -1;
        int i = 0;
        Node<E> current = head;

        while (current != null) {
            if (current.element.equals(e)) {
                index = i;
            }
            i++;
            current = current.next;
        }
        return index;
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        } else {
            Node<E> replace = head;
            for (int i = 0; i < index; i++)
                replace = replace.next;
            replace.element = e;
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        String s = "";
        for (Node<E> current = head; current != null; current = current.next) {
            s = current.element + " " + s;
        }
        System.out.println(s);
    }
}
