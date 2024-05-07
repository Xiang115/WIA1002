package LabTest.Practise.LabTest2.Thursday.Q3;

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {1,2,3,4,5,6,7,8,9,10};
        int[] num3 = {1,2,3,4,5,6,7,8,9,10};

        reverseQueue(num1, 3);
        reverseQueue(num2, 4);
        reverseQueue(num3, 5);
    }

    public static void reverseQueue(int[] arr, int k){
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : arr){
            queue.add(num);
        }

        System.out.println("Original Queue: " + queue.toString());

        for(int i=0;i<k;i++){
            temp.offer(queue.poll());
        }

        while(!temp.isEmpty()){
            queue.add(temp.poll());
        }

        for(int i = 0; i < arr.length-k;i++){
            queue.add(queue.poll());
        }

        System.out.println("Reversed Queue: " + queue.toString());
        System.out.println();
    } 
}
