package PLN;

import java.util.Scanner;

public class SeatingAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] testcase = new int[N][3];

        // Read input for each test case
        for (int i = 0; i < N; i++) {
            // Read values for type A, type B, and type C guests
            testcase[i][0] = sc.nextInt(); // Number of type A guests
            testcase[i][1] = sc.nextInt(); // Number of type B guests
            testcase[i][2] = sc.nextInt(); // Number of type C guests
        }
        sc.close();
    }
}
