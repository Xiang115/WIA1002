package Lab.Lab8.Q1;

import java.util.Comparator;
//used to define custom sorting logic for objects

public class QueueComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        if (num1 < num2) {
            return 1;
        } else if (num1 > num2) {
            return -1; // set num1 as high priority
        } else {
            return 0;
        }

        // alternative approach
        // return -1 * Integer.compare(num1, num2);
    }
}
