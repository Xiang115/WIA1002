package Tutorial.Tutorial4.Q1;

public class LinkedList<E> {
    protected Node<E> head, tail;
    private int size = 0;

    public void add(E o) {
        add(size, o);
    }

    public void add(int index, E o) {
        //		e)
//		Condition to consider:
//		Throw an exception when index < 0 || index > size
//		Add the node otherwise

//		f)
//		If index equals 0, invoke addFirst() method
//		If index equals the size of the list, invoke the addLast() method
//		Otherwise, search for the (index - 1) th node assign it to the prev
//		Add the newNode next to the prev
//		Set the next of the newNode to the node after the prev
//		Increment the size of the list by 1
//		
//		g)
        Node<E> newNode = new Node<>(o);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }else if (index == 0) {
            addFirst(o);
        } else if (index >= size) {
            addLast(o);
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

    public void addLast(E o) {
     //      e)
//      Condition to consider:
//      Whether the list contains any node.
//      If it doesn't, the head should be set to this new node.
//
//      f)
//      Set the next of the tail to the newNode and set the new tail
//
//      g)
        Node<E> newNode = new Node<>(o);
        if (tail == null) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(E o) {
    //      e)
//      Condition to consider:
//      Whether the list contains any node.
//      If it doesn't, the tail should be set to this new node.
//
//      f)
//      Set the next of this firstNode to the current head.
//      Set the head to this firstNode.
//
//      g)
        Node<E> newNode = new Node<>(o);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void remove(int index) {
//      e)
//      Condition to consider:
//      Throw IndexOutOfBoundsException when index < 0 || index > size - 1
//
//      f)
//      If the index is 0, invoke the removeFirst method.
//      Otherwise, search for (index-1)th node and assign it to current.
//      Set the next of the current to the node after the next of the current.
//
//      g)
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
        //		e) 
//		Condition to consider:
//		If the list has no node, throw NoSuchElementException
//		If the list has only one node, set both head and tail to null.
//
//		f)
//		Set the head to the node after the current head
//		
//		g)
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void removeLast() {
        //      e)
//      Condition to consider:
//		If the list has no node, throw NoSuchElementException
//		If the list has only one node, set both head and tail to null.
//
//      f)
//      Assign the node before the tail to prev.
//      Set the next of the prev to null.
//
//      g)
        Node<E> current = head;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node<E> item = head;
        while (item != null) {
            if (item == tail) {
                System.out.print(item.element);
            } else {
                System.out.print(item.element + " -> ");
            }
            item = item.next;
        }
        System.out.println();
    }
}
