package LabTest.Practise.LabTest2.Friday.Q3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 8, 9, 0, 1 };
        int[] arr2 = { 9, 8, 6, 4, 3, 1 };
        int[] arr3 = { 1, 2, 3, 4, 10, 6, 9, 8, 7, 5 };

        SlidingWindow(arr1, 3);
        SlidingWindow(arr2, 4);
        SlidingWindow(arr3, 3);
    }

    private static void SlidingWindow(int[] arr, int k) {
        System.out.println("Input arr[]: " + Arrays.toString(arr) + ", k = " + k);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = arr.length;
        int index = 0;
        int[] output = new int[n - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                queue.offer(arr[index + j]);
            }
            output[i] = queue.peek();
            index++;
            queue.clear();
        }

        System.out.println("Output: " + Arrays.toString(output));
        System.out.println("Explanation: The window size is " + k + " and the maximum at different iterations" +
                " are as follows:");

        index = 0;
        for (int i = 0; i < n - k + 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("min(");
            for (int j = 0; j < k; j++) {
                sb.append(arr[index + j]).append(',').append(' ');
            }
            sb.setLength(sb.length() - 2);
            sb.append(") = ").append(output[i]);
            System.out.println(sb.toString());
        }
        System.out.println("Hence, we get arr = " + Arrays.toString(output) + " as output.");
        System.out.println();
    }
}
