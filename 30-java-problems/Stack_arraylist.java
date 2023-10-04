import java.util.Stack;

public class Stack_arraylist{
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
           System.out.println( stack);
        // Pop an element off the stack
        int popped = stack.pop();
        System.out.println("element popped" +popped); // Outputs "3"

        // Check the top element of the stack without removing it
        int top = stack.peek();
        System.out.println("top element " +top); // Outputs "2"

        // Check if the stack is empty
        System.out.println( "checking whether stack is empty or not -" +stack.empty()); // Outputs "false"

        // Get the size of the stack
        System.out.println("size of stack is " +stack.size()); // Outputs "2"
    }
}
