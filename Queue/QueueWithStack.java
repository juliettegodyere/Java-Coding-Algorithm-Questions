package Queue;

import java.util.Stack;

public class QueueWithStack {
    static Stack<Integer> input = new Stack<Integer>(); 
   static  Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    static int deQueue()
    {
	    // Your code here
	    if (input.isEmpty()){
            return 0;
        }
        int popped = input.peek();
        input.pop();
        return popped;
	    
    }
	
    /* The method push to push element into the stack */
    static void enQueue(int x){
	    // Your code here
        while (!input.isEmpty()){
            System.out.println(input.pop());
            output.push(input.pop());
            //input.pop();
        }
 
        // Push item into input
        input.push(x);
 
        // Push everything back to input
        while (!output.isEmpty())
        {
            input.push(output.pop());
            //output.pop();
        }
        
	    
    }
    public static void main(String[] args)
{
    QueueWithStack q = new QueueWithStack();
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
 
    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
}
    
}
