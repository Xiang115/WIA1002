package Lab.Lab8.Q1;

import java.util.PriorityQueue;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = { 4, 8, 1, 2, 9, 6, 3, 7 };
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(nums));
        // Arranged by natural ordering

        System.out.println("Priority Queue: " + queue);
        System.out.printf("%d is removed\n", queue.poll());

        queue.add(-2);
        queue.add(5);
        queue.add(8);
        queue.add(7);
        queue.add(3);

        Integer[] arr = queue.toArray(new Integer[queue.size()]);
        // Arrays.toString() function is used to convert an array into a readable string
        // representation.
        System.out.println("Queue to Array: " + Arrays.toString(arr));

        System.out.println("First element of Priority queue: " + queue.peek()); // it will show the lowest integer
        System.out.println("Does element \'1\' contains in the queue?: " + queue.contains(1));
        System.out.println("The size of priority queue: " + queue.size());

        System.out.print("Queue using isEmpty(): ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> queue2 = new PriorityQueue<>(new QueueComparator()); // create QueueComparator object
        for (int num : nums)
            queue2.add(num);
        System.out.println("Queue: " + queue2);
    }
}
