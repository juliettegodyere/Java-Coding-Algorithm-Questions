package LinkedList.problem;

import LinkedList.Node;

public class RemoveDuplicates {
    static Node removeAllDuplicates(Node head){
        if(head == null){
            return null;
        }
        Node dummy = new Node(0);
        Node prev = dummy;

        Node current = head;

        while (current != null && prev.next.data == current.next.data){
            current = current.next;
        }
        if(prev.next == current){
            prev = prev.next;
        }else{
            prev.next = current.next;
        }
        current = current.next;
        head = dummy.next;

        return head;
    }
}
