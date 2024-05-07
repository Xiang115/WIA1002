package LabTest.Practise.LabTest2.Thursday.Q2;

import java.util.Stack;

public class KingCrimson {
    public static String getActions(String[] initialOrder, String[] finalOrder) {
        Stack<String> residents = new Stack<>();
        Stack<String> foyer = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int finalOrderIndex = 0;

        for (int i = initialOrder.length - 1; i >= 0; i--) {
            residents.push(initialOrder[i]);
        }

        while (!residents.isEmpty()) {
            if (residents.peek().equals(finalOrder[finalOrderIndex])) {
                sb.append(String.format("%d Diavolo instructs %s to enter the college.\n", ++count, residents.pop()));
                finalOrderIndex++;
            } else {
                if (!foyer.isEmpty()) {
                    if (foyer.peek().equals(finalOrder[finalOrderIndex])) {
                        sb.append(
                                String.format("%d Diavolo instructs %s to enter the college.\n", ++count, foyer.pop()));
                        finalOrderIndex++;
                        continue;
                    }
                }
                sb.append(String.format("%d Diavolo instructs %s to stay in th foyer.\n", ++count, residents.peek()));
                foyer.push(residents.pop());
            }
        }

        while (!foyer.isEmpty()) {
            if (foyer.peek().equals(finalOrder[finalOrderIndex])) {
                sb.append(String.format("%d Diavolo instructs %s to enter the college.\n", ++count, foyer.pop()));
                finalOrderIndex++;
            }else{
                return "King Crimson!!!\n";
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        final int N = 8;
        final String[][] initialOrderArray = {
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Jolyne", "Giorno", "Josuke", "Jotaro", "Joseph",
                        "Jonathan" },
                { "DIO", "Kira", "Pucci" }
        };

        final String[][] finalOrderArray = {
                { "Hermit Purple", "Hierophant Green", "Magician Red",
                        "Silver Chariot", "Star Platinum" },
                { "Star Platinum", "Silver Chariot", "Hermit Purple",
                        "Hierophant Green", "Magician Red" },
                { "Hermit Purple", "Silver Chariot", "Magician Red",
                        "Hierophant Green", "Star Platinum" },
                { "Magician Red", "Silver Chariot", "Hierophant Green",
                        "Star Platinum", "Hermit Purple" },
                { "Magician Red", "Silver Chariot", "Hierophant Green",
                        "Hermit Purple", "Star Platinum" },
                { "Silver Chariot", "Magician Red", "Star Platinum",
                        "Hierophant Green", "Hermit Purple" },
                { "Jonathan", "Joseph", "Jotaro", "Josuke", "Giorno",
                        "Jolyne" },
                { "Pucci", "DIO", "Kira" }
        };

        for (int i = 0; i < N; i++) {
            System.out.printf("Case %d\n", i + 1);
            System.out.println(getActions(initialOrderArray[i],
                    finalOrderArray[i]));
        }
    }
}
