package LinkedList.problem;

import LinkedList.Node;
//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/?company[]=Amazon&company[]=Amazon&page=1&query=company[]Amazonpage1company[]Amazon
public class DeleteWithoutHeadPointer {
    static Node head;

    void deleteNode(Node node)
    {
         // Your code here
         if(node.next == null){
             return;
         }
         Node del = node.next;
         node.data = del.data;
         node.next = del.next;
         System.gc();
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        DeleteWithoutHeadPointer list = new DeleteWithoutHeadPointer();
        list.head = new Node(1);
        list.head.next = new Node(2);
 
        list.deleteNode(head);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList(head);
    }
}
