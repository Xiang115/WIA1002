package Lecture.Lecture8;

import java.util.Stack;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PostfixToInfix {
    private static final Set<String> operator = new HashSet<>(List.of("+","-","*","/","^"));
    public static void main(String[] args) {
        System.out.printf("2 3 + 4 * 5 - : %s\n", ConvertInfix("2 3 + 4 * 5 -"));
        System.out.printf("2 3 * 4 2 - / 5 6 * + :  %s\n", ConvertInfix("2 3 * 4 2 - / 5 6 * + "));
        System.out.printf("2 4 - 3 ^ 5 + : %s\n", ConvertInfix("2 4 - 3 ^ 5 + "));
    }

    private static String ConvertInfix(String equation) {
        Stack<String> stack = new Stack<>();
        String[] tokens = equation.split(" ");
        for (String token : tokens) {
            if(isNumeric(token)){
                stack.push(token);
            }else{
                if(operator.contains(token)){
                    String num2 = stack.pop();
                    String num1 = stack.pop();
                    String result = "(" + num1 + token + num2 + ")";
                    stack.push(result);
                }
            }
        }
        return stack.peek();
    }

    private static boolean isNumeric(String token) {
        return Character.isDigit(token.charAt(0));
    }
}
