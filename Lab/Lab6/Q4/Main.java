package Lab.Lab6.Q4;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dfhcdji","ckmckm","abcba","wdjiwjd","hahaha"};
        for(String word : words){
            System.out.printf("%s is palindrome?: %b\n",word, isPalindrome(word));
        }
    }

    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        char[] words = word.toCharArray();
        for (char c : words)
            stack.push(c);
        for (char c : words)
            if (c != stack.pop()) 
                return false;
        return true;
    }
}
