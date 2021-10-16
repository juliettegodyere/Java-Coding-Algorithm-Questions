package LinkedList.problem;
import LinkedList.Node;
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
//https://www.youtube.com/watch?v=Tk_fi5l8cag
//https://www.geeksforgeeks.org/reverse-a-linked-list/

public class ReverseALinkedlist {
    static Node head;
    Node reverseList(Node head)
    {
        // code here
        if(head == null){
            return null;
        }
        Node prevNode, currentNode, nextNode;
        prevNode = null;
        currentNode = nextNode = head;
        while(nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
        return head;
    }

    static void printList(Node head){
        Node temp = head;
        System.out.println("\n\nList elements are - \n");
        while(temp != null){
            System.out.printf("%d --->", temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args)
    {
        ReverseALinkedlist list = new ReverseALinkedlist();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

