package Tutorial.Tutorial4.Q1;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        //(a)
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');

        list.head = node1;
        list.tail = node2;

        //(c)
        node1.next = node2;

        //(d)
        Node<Character> firstNode = new Node<Character>('f');
        
        //Initializing the list
        // list.add('a');
        // list.add('z');
        // list.addFirst('f');

        list.addLast('c');
        list.add(2, 'd');
        list.remove(1);
        list.display();
    }
}
