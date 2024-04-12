package Tutorial.Tutorial4.Q2;

public class LinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    public boolean contain(E e){
        Node<E> pointerB = head;
        while(pointerB!=null){
            if(pointerB.element.equals(e)){
                System.out.println(pointerB.element);
                return true;
            }
            pointerB = pointerB.next;
        }
        return false;
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E o){
            this.element = o;
        }
    }
}
