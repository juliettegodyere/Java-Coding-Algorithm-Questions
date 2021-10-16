package Stack;

public class UsingList {
    Node head;

    class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    boolean isEmpty(){
        if(head == null){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
    int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        System.out.println("Peeked value: " + head.data);
        return head.data;
    }

    int pop(){
        int popped = Integer.MIN_VALUE;
        if(head == null){
            System.out.println("Stack is Empty");
            return 0;
        }
        popped = head.data;;
        head = head.next;
        System.out.println("Popped value: " + popped);
        return popped;
    }
    boolean push(int value){
        Node newNode = new Node(value);
        if(head == null){
            System.out.println("Stack is empty so just add a new node");
            head = newNode;
        }
        System.out.println("Stack is not empty so just add a new node to the beginning");
        Node temp = head;
        head = newNode;
        newNode = temp.next;
        return true;
    }
    public static void main(String[] args)
    {
 
        UsingList sll = new UsingList();
 
        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());
    }
}
