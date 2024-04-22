package Lab.Lab6.Q2;

import java.util.Scanner;
import Lab.Lab6.Q1.MyStack;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Prompt user to enter an integer value.
        System.out.print("Enter an integer value: ");
        int value = sc.nextInt();
        sc.close();

        // b) Push the values 1 through the user entered value onto the stack.
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i <= value; i++) {
            stack.push(i);
        }

        // c) Print the size of the stack.
        System.out.println("The size of the stack: " + stack.getSize());

        /*
         * d) Display the contents of the stack by repeatedly calling pop() until the
         * stack is empty.
         */
        System.out.print("stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Answers:
        // Output: n = user entered value n-1 n-2 ... 2 1
        // Order: Descending order
        // Reason: Stack is a last in, first out data structure.
        // Therefore, the larger numbers are popped first as they are pushed later than
        // the smaller numbers.
    }
}
