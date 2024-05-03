
package Lab.Lab8.Q2;

import java.util.PriorityQueue;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] list1 = { "George", "Jim", "John", "Blake", "Kevin", "Michael" };
        String[] list2 = { "George", "Katie", "Kevin", "Michelle", "Ryan" };

        PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(list1));
        PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(list2));

        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        union.addAll(queue2);
        System.out.println("Union: " + union.toString());

        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
        difference.removeAll(queue2);
        System.out.println("Difference of A: " + difference.toString());

        PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
        intersection.retainAll(queue2);
        System.out.println("Intersection: " + intersection.toString());
    }
}
