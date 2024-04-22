package Lab.Lab6.Q5;

import java.util.Stack;
import java.util.Scanner;

public class TowerOfHanoi {
    @SuppressWarnings("unchecked")
    private static Stack<Integer>[] rods = new Stack[3];
    private static int numOfDisk;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        numOfDisk = sc.nextInt();
        sc.close();

        // initialize
        for (int i = 0; i < 3; i++) {
            rods[i] = new Stack<>();
        }
        for (int i = numOfDisk; i > 0; i--) {
            rods[0].push(i);
        }

        display();
        solve(numOfDisk, rods, 0, 1, 2);
    }

    /*
     * This solution is using the recursive algorithm to solve it.
     * For example: n = 3
     * 1) move 2 disk from A to B ----> (n-1) disk from A to B
     * 2) move 1 disk from A to C 
     * 3) move 2 disk from B to C ----> (n-1) disk from B to C
     * 
     * so that we can set the base case to when n=1 move the disk to C
     */
    public static void solve(int numOfDisk, Stack<Integer>[] rods, int first, int middle, int end) { 
        //base case
        if (numOfDisk == 1) {
            rods[end].push(rods[first].pop());
            display();
        } else {
            //move
            solve(numOfDisk - 1, rods, first, end, middle); 
            rods[end].push(rods[first].pop());
            display();
            //reset
            solve(numOfDisk - 1, rods, middle, first, end); 
        }
    }

    public static void display() {
        System.out.println(display(numOfDisk, rods));
    }

    @SuppressWarnings("unchecked")
    public static String display(int numOfDisk, Stack<Integer>[] stacks) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer>[] tempStack = new Stack[3];

        for (int i = 0; i < 3; i++) {
            tempStack[i] = new Stack<>();
            tempStack[i].addAll(stacks[i]);
        }

        for (int row = numOfDisk + 1; row > 0; row--) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < tempStack.length; i++) {
                if (tempStack[i].size() == row) {
                    line.append(" ").append(disc(numOfDisk, tempStack[i].peek())).append(" ");
                    tempStack[i].pop();
                } else {
                    line.append(" ").append(rod(numOfDisk)).append(" ");
                }
            }
            line.append("\n");
            sb.append(line);
        }
        sb.insert(0, "\n");

        for (int i = 0; i <= 2; i++) {
            sb.append(String.format(" %s+%s ", "-".repeat(numOfDisk + 1), "-".repeat(numOfDisk + 1)));
        }
        sb.append("\n");
        for (int i = 0; i <= 2; i++) {
            sb.append(String.format(" %s%d%s ", "-".repeat(numOfDisk + 1), i + 1, "-".repeat(numOfDisk + 1)));
        }
        sb.append("\n");
        return sb.toString();
    }

    public static String rod(int numOfDisk) {
        int space = numOfDisk + 1;
        return String.format("%s|%s", " ".repeat(space), " ".repeat(space));
    }

    public static String disc(int numOfDisk, int size) {
        int space = numOfDisk + 1 - size;
        return String.format("%s%s|%s%s", " ".repeat(space), "=".repeat(size), "=".repeat(size), " ".repeat(space));
    }
}
