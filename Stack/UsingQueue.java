package Stack;

import java.util.*;;

public class UsingQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int value){
        q1.add(value);

        while (!q1.isEmpty()){
            System.out.println(q1.poll());
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void pop(){
        if(q1.isEmpty()){
            return;
        }else{
            q1.remove();
        }
        
     }

     int top(){
        if(q1.isEmpty()){
            return -1;
        }else{
            return q1.peek();
        }
        
     }

     public static void main(String[] args)
    {
        UsingQueue s = new UsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
  
       
    }
}
