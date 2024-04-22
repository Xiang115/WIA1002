package Lab.Lab6.Q1;

public class TestMyStack {
    public static void main(String[] args) {
        // (1) add elements, a b and c in the stack.
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');

        // (2) Print the stack
        System.out.println(stack);

        // (3) Check if element ‘b’ is in the stack.
        System.out.println("Does \'b\' exist in the stack?: " + stack.search('b'));

        // (4) Check if element ‘k’ is in the stack.
        System.out.println("Does \'k\' exist in the stack?: " + stack.search('k'));

        // (1) add elements, 1 2 and 3 in the stack.
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        // (2) Print the stack
        System.out.println(stack2);

        // (3) Check if element ‘6’ is in the stack.
        System.out.println("Does \'6\' exist in the stack?: " + stack2.search(6));
    }
}
