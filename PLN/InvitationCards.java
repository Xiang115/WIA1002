package PLN;

import java.util.*;

public class InvitationCards {
    static int maxNestedCards(int[][] cards) {
        int n = cards.length;

        Arrays.sort(cards, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0]; 
            } else {
                return b[1] - a[1]; 
            }
        });

        int maxNestedCards = 1;
        int prevLength = cards[0][0];
        int prevBreadth = cards[0][1];

        for (int i = 1; i < n; i++) {
            int currLength = cards[i][0];
            int currBreadth = cards[i][1];

            if (currLength < prevLength && currBreadth < prevBreadth) {
                maxNestedCards++;
                prevLength = currLength;
                prevBreadth = currBreadth;
            }
        }

        return maxNestedCards;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of cards
        int[][] cards = new int[N][2];
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt(); // Length of the card
            int B = scanner.nextInt(); // Breadth of the card
            cards[i][0] = L;
            cards[i][1] = B;
        }

        int result = maxNestedCards(cards);
        System.out.println(result);
        scanner.close();
    }
}