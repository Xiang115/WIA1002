package Lab.Lab7.Q3;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/*
Buy 100 shares at $10 each
Buy 50 shares at $20 each
Sell 50 shares at $20 each
Sell 60 shares at $30 each
Sell 50 shares at $35 each
 */

public class Main {
    private static Queue<Integer> share;
    private static Queue<Integer> price;
    private static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        share = new LinkedList<>();
        price = new LinkedList<>();

        while (true) {
            System.out.print("Enter your query (In format \'Buy / Sell x shares at $y each\'): ");
            String query = sc.nextLine();

            if (query.isBlank())
                break;

            String[] word = query.split(" ");
            if (word[0].equalsIgnoreCase("Buy")) {
                share.offer(Integer.parseInt(word[1]));
                price.offer(Integer.parseInt(word[4].substring(1)));
                System.out.println("Buying now...");
                waiting();
                Display();

            } else if (word[0].equalsIgnoreCase("Sell")) {
                int SellShare = Integer.parseInt(word[1]);
                int SellPrice = Integer.parseInt(word[4].substring(1));
                System.out.println("Selling the shares now...");
                waiting();
                calcTotal(SellShare, SellPrice);
                Display();
            }
        }
        sc.close();
        System.out.println("Final Capital Gain / Loss: " + total);
    }

    public static void Display() {
        System.out.println("Queue for Share: Queue: " + share);
        System.out.println("Queue for Price: Queue: " + price);
    }

    public static void calcTotal(int SellShare, int SellPrice) { //50 left 40 only
        while (SellShare > 0) {
            //so this one will read again then break the while loop
            if (share.isEmpty()) {
                System.out.println("No shares to sell!");
                break;
            }

            if (SellShare >= share.peek()) {
                total += share.peek() * (SellPrice - price.poll());
                SellShare -= share.poll(); //sellshare = 10
            } else {
                total += SellShare * (SellPrice - price.peek());
                share.offer(share.peek() - SellShare);
                share.poll();
                for (int i = 0; i < share.size() - 1; i++) {
                    share.offer(share.poll());
                }
                SellShare = 0;
            }
            System.out.println("Total Capital Gain / Loss: " + total);
        }
    }

    static void waiting(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void waiting() {
        waiting(1000);
    }
}
