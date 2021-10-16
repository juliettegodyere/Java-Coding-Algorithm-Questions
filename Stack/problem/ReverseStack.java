package Stack.problem;

import java.util.Stack;

public class ReverseStack {

    static Stack<Integer> reverse(Stack<Integer> original){
        Stack<Integer> reversed = new Stack<Integer>();

        while (!original.empty()){
            reversed.push(original.pop());
            // System.out.print(original.peek());
        }

        return reversed;
    }
    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);

        // This is the temporary stack
        Stack<Integer> tmpStack = reverse(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}
