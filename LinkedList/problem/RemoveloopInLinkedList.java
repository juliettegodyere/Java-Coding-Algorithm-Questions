package LinkedList.problem;
import java.util.*;

//Question: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#
//Solution: https://www.techiedelight.com/remove-loop-linked-list/
import LinkedList.Node;

public class RemoveloopInLinkedList {
    //Passed all test cases
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node prev = null;
        Node curr = head;
 
        Set<Node> set = new HashSet<>();
 
        while (curr != null){
            if (set.contains(curr))
            {
                prev.next = null;
                return;
            }
 
            set.add(curr);
 
            prev = curr;
            curr = curr.next;
        }
    }

    public static Node push(Node head, int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " —> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args){
        int n = 5;
 
        Node head = null;
        for (int i = n + 1; i > 0; i--) {
            head = push(head, i);
        }
 
        // insert cycle
        head.next.next.next.next.next = head.next;
 
        removeLoop(head);
        printList(head);
    }
}
