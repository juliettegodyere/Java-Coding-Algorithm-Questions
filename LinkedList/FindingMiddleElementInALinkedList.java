package LinkedList;

import LinkedList.Node;
//Qusetion https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
public class FindingMiddleElementInALinkedList {
    static Node head;

    static void insert(int value){
        if(head == null){
            head = new Node(value);
        }else{
            Node newNode = new Node(value);
            newNode.next = head.next;
            head = newNode;
        }
    }
    static void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //Passed all test cases
    static int middleNode(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    //passed all test cases
    static int middleNode2(Node head) {
        Node node = head;
        int len = 0;

        while(node != null){
            node = node.next;
            len++;
        }
        int c = 0;
        node = head;
        while(c < len/2){
            node = node.next;
            c++;
        }
        return node.data;
    }
    public static void main (String[] args)
    {
        // Creating the list 1.2.4.5
        head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
         
        int ans = middleNode(head);
        System.out.println(ans);
        int ans2 = middleNode2(head);
        System.out.println(ans2);
        display();
    }
}
