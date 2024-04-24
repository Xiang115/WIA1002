package Lab.Lab6.Q4;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dfhcdji","ckmckm","abcba","wdjiwjd","hahaha"};
        for(String word : words){
            System.out.printf("%s is palindrome?: %b\n",word, isPalindromeV2(word));
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

    // abcba
    public static boolean isPalindromeV2(String word){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<(word.length()+1)/2;i++){
            stack.push(word.charAt(i));
        }
        for(int i = word.length()/2;i<word.length();i++){
            if(word.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
