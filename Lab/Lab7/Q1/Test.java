package Lab.Lab7.Q1;

public class Test {
    public static void main(String[] args) {
        //a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        String[] fruitQ = { "Durian", "Blueberry" };
        MyQueue<String> queue = new MyQueue<>(fruitQ);

        //b. Then add new items in the following order: Apple, Orange, Grapes, Cherry.
        queue.enqueue("Apple");
        queue.enqueue("Orange");
        queue.enqueue("Grapes");
        queue.enqueue("Cherry");

        //c. Display the queue.
        System.out.println("Queue: " + queue);

        //d. Show the top item.
        System.out.println("Top item in queue: " + queue.peek());

        //e. Get the queue size.
        System.out.println("Queue size: " + queue.getSize());

        //f. Delete Durian.
        queue.dequeue();

        //g. Get item in index position of 2
        System.out.println("Item in index position of 2: " + queue.getElement(2));

        //h. Check whether the queue consists of Cherry
        System.out.println("Does \'Cherry\' contains in list? : " + queue.contains("Cherry"));

        //i. Check whether the queue consists of Durian
        System.out.println("Does \'Durian\' contains in list? : " + queue.contains("Durian"));

        //j. Display the queue using the isEmpty() condition.
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
