package LinkedList;

public class LinkedList {
    Node head;

    // class Node {

    //     int data;
    //     Node next;
    
    //     Node(int d) {
    //         data = d;
    //         next = null;
    //     }
    // }
    static void printLinledList(Node head){
        Node temp = head;
        System.out.println("\n\nList elements are - \n");
        while(temp != null){
            System.out.printf("%d --->", temp.data);
            temp = temp.next;
        }

    }

    static void insertLinledListBeginning(Node head, int value){
        Node newNode = head;
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }
    static void insertLinledListEnd(Node head, int value){
        Node newNode = head;
        newNode.data = value;
        newNode.next = null;

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //https://www.youtube.com/watch?v=6wXZ_m3SbEs
    static void insertLinkedListMiddle(Node head, int value, int position){
        Node newNode = head;
        newNode.data = value;

        Node temp = head;
        for(int i = 2; i < position; i++){
            if(temp.next != null){
                temp = temp.next;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    static boolean isOdd(int value){
        if(value % 2 != 0){
            return true;
        }
        return false;
    }
    static boolean isEven(int value){
        if(value % 2 == 0){
            return true;
        }
        return false;
    }

    static void rearrangeEvenOdd(Node head){
        if(head != null){
            System.out.printf(null);
        }
          //  The task is to complete this method
        // Node temp = head;
        Node prev = head; 
        Node current = head.next;
        while(current.next != null){
             if(isEven(prev.data) && isOdd(current.data)){
                 //swap current with prev
                 
             }
         }
           
     }
    
}
