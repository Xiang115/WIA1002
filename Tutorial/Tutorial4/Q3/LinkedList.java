package Tutorial.Tutorial4.Q3;

public class LinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    public E removeLast(){

        if(size==0){
            return null;
        }else if(size==1){
            head = tail = null;
            size = 0;
            return tail.element;
        }else{

            Node<E> pointer1 = head;

            for(int i=0;i<size-2;i++){
                pointer1 = pointer1.next;
            }
            
            Node<E> temp = tail;
            tail = pointer1;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E o){
            this.element = o;
        }
    }
}
