package stack.method;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        int element = stack.pop();
        System.out.println("Popped element: " + element);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
//        int size = stack.size();
//        System.out.println("Size of the stack: " + size);
    }
}