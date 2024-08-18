package stack;

import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        // Using the inbuilt Stack class
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(25);
        stack.push(19);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        // Creating and using a CustomStack
        CustomStack cstack = new CustomStack(12);
        cstack.push(5);
        cstack.push(10);
        System.out.println(cstack);
    }
}
