package Lab.Lab6.Q3;

import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random r = new Random();

        for(int i=0;i<5;i++){
            stack.push(r.nextInt(10));
        }

        System.out.println("Stack: " + stack.toString());
        System.out.println("The sum of every elements in stack: " + calcSum(stack));
    }

    public static int calcSum(Stack<Integer> stack){
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
