package Lab.Lab7.Q2;

import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String[] tester = { "wfnei", "ewiruesa", "abcba", "qwertytrewq", "eoirf" };
        for (String word : tester) {
            System.out.printf("%s is palindrone? : %b\n", word, isPalindrome(word));
        }
    }

    public static boolean isPalindrome(String word) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < (word.length() + 1) / 2; i++)
            queue.offer(word.charAt(i));
        for (int i = word.length() - 1; i > word.length() / 2; i--) {
            if (word.charAt(i) != queue.poll())
                return false;
        }
        return true;
    }
}
