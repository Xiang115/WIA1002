public class TestGenericQueue {
  public static void main(String[] args) {
    // Create a queue
    GenericQueue<String> queue = new GenericQueue<String>();

    // Add elements to the queue
    queue.enqueue("Tom"); // Add it to the queue
    System.out.println("(7) " + queue);

    queue.enqueue("Susan"); // Add it to the queue
    System.out.println("(8) " + queue);

    queue.enqueue("Kim"); // Add it to the queue
    queue.enqueue("Michael"); // Add it to the queue
    System.out.println("(9) " + queue);

    // Remove elements from the queue
    System.out.println("(10) " + queue.dequeue());
    System.out.println("(11) " + queue.dequeue());
    System.out.println("(12) " + queue);
  }
}
