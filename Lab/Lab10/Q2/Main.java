package Lab.Lab10.Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word = "ABC";
        List<String> permutation = permuteString(word);
        for (String letter : permutation) {
            System.out.println(letter);
        }
    }

    public static List<String> permuteString(String s) {
        List<String> result = new ArrayList<>();

        // base case: if string is empty, return an empty string
        if (s.isEmpty()) {
            result.add("");
            return result;
        }

        // recursive case: loop through each character
        for (int i = 0; i < s.length(); i++) {
            //Extract the current char
            char currentChar = s.charAt(i);
            //Remaining string after removing the current char
            String StirngRemaing = s.substring(0, i) + s.substring(i+1);
            // Generate permutation of the remaining string
            List<String> remainingPermutation = permuteString(StirngRemaing);
            //Append the currentChar to each permutation of the remaining string
            for(String perm : remainingPermutation){
                result.add(currentChar + perm);
            }
        }
        return result;
    }
}
