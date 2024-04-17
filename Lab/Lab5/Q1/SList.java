package Lab.Lab5.Q1;

public class SList<E> {
    private SNode<E> head, tail;
    private int size;

    public void appendEnd(E e){
        SNode<E> temp = new SNode<>(e);
        if(size == 0){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
        System.out.println("Adding " + temp.item);
    }

    public E removeInitial(){
        if(head == null){
            return null;
        }
        E item = head.item;
        if(size==1){
            head = tail = null;
        }else{
            head = head.next;
        }
        size--;
        return item;
    }

    public boolean contains(E e){
        SNode<E> current = head;
        while(current != null){
            if(current.item.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear(){
        SNode<E> temp = head;
        while(head != null){
            temp = head.next;
            head.next = null;
            head = temp;
        }
        tail = null;
        size = 0;
        System.out.println("The list is empty");
    }

    public void display(){
        SNode<E> temp = head;
        while(temp != null){
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
