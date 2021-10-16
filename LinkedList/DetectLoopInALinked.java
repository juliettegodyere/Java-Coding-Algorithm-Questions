package LinkedList;

import java.util.HashSet;

public class DetectLoopInALinked {
    static class Node2 {
        int data;
        Node2 next;
        int flag;
    };

    static Node head;

    // Method 1- Passed all test cases
    //https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
    static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);

            h = h.next;
        }

        return false;
    }

    /* Inserts a new Node at front of the list. Method 1 push */
    static public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static Node2 push2(Node2 head_ref, int new_data) {
        Node2 new_node = new Node2();
        new_node.data = new_data;

        new_node.flag = 0;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop2(Node2 h) {
        while (h != null) {
            if (h.flag == 1)
                return true;

            h.flag = 1;

            h = h.next;
        }
        return false;
    }

    void detectLoop3() {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }

    public static void main(String[] args) {
        DetectLoopInALinked llist = new DetectLoopInALinked();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /* Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}
