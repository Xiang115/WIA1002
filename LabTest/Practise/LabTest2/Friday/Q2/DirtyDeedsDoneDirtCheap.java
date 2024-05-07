package LabTest.Practise.LabTest2.Friday.Q2;

import java.util.Stack;

public class DirtyDeedsDoneDirtCheap {
    /*
     * ● "Travel <dimension name>": Valentine travels to a dimension with the
     * specified name.
     * ● "Destroy <dimension name>": The dimension with the specified name is
     * destined for
     * destruction. Valentine swiftly returns to the safe dimension, as mentioned
     * above.
     * ● "Ask": Valentine queries about the dimension he is currently in, and you
     * need to display the
     * name of that dimension. If he is in his original dimension, you should print
     * "In Original
     * Dimension".
     */
    public static void displayAnswers(String[] actions) {
        final Stack<String> stack1 = new Stack<>(); // destination
        final Stack<String> stack2 = new Stack<>(); // destroy

        for (String action : actions) {
            String[] key = action.split(" ");
            if (key[0].equals("Ask")) {
                System.out.println((stack1.isEmpty() ? "In Original Dimension" : stack1.peek()));
            } else if (key[0].equals("Travel")) {
                stack1.push(action.substring(7));
            } else if (key[0].equals("Destroy")) {
                String destination = action.substring(8);
                while (!stack1.isEmpty()) {
                    if (!stack1.peek().equals(destination)) {
                        stack2.push(stack1.pop());
                    } else {
                        stack1.pop();
                        stack2.clear();
                    }
                }
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        final String[][] actionArray = {
                { "Travel Three Kingdoms", "Travel Suzume Door",
                        "Travel JOJOLands", "Ask", "Travel FaceBook", "Travel JOJOLands",
                        "Travel Trading World", "Ask", "Destroy JOJOLands", "Ask", "Travel FaceBook", "Ask",
                        "Travel Trading World", "Travel Three Kingdoms", "Ask", "Destroy Three Kingdoms",
                        "Ask" },
                { "Travel Morioh", "Travel Colosseum", "Travel Cape Canaveral",
                        "Ask", "Travel Morioh", "Travel Sardinia", "Destroy Morioh",
                        "Destroy Devil's Palm", "Ask", "Travel Cape Canaveral", "Ask", "Travel Colosseum",
                        "Destroy Sardinia", "Ask", "Travel Naples", "Destroy Colosseum",
                        "Ask" },
                { "Ask", "Travel Jade Garden", "Travel Cafe Deux Magots",
                        "Ask", "Travel Trattoria Trussardi", "Travel Jade Garden", "Travel Cafe Deux Magots",
                        "Travel Trattoria Trussardi", "Ask", "Destroy Trattoria Trussardi",
                        "Ask", "Travel Libeccio", "Travel Cafe Deux Magots", "Travel Jade Garden",
                        "Travel Savage Garden", "Destroy Libeccio", "Ask", "Destroy Savage Garden",
                        "Destroy Cafe Deux Magots", "Ask" }
        };

        for (int i = 0; i < actionArray.length; i++) {
            System.out.printf("Case %d\n", i + 1);
            displayAnswers(actionArray[i]);
            System.out.println();
        }
    }
}
