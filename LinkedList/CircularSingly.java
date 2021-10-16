package LinkedList;

public class CircularSingly {
   static class SinglyNode{
        int data;
        SinglyNode next;
    }

    static SinglyNode addEmptyNode(SinglyNode last, int data){
        SinglyNode temp = new SinglyNode();

        temp.data = data;
        temp = last;
        temp.next = last;

        return last;
    }

    static SinglyNode addFrontNode(SinglyNode last, int data){
        SinglyNode temp = new SinglyNode();
        if(last == null){
           return addEmptyNode(last, data);
        }
        temp.data = data;
        temp.next = last.next;
        last.next = temp;

        return last;
    }

    static SinglyNode addEndNode(SinglyNode last, int data){
        SinglyNode temp = new SinglyNode();
        if(last == null){
           return addEmptyNode(last, data);
        }
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        last = temp;

        return last;
    }

    static SinglyNode addMiddleNode(SinglyNode last, int data, int item){
        if (last == null)
            return null;
 
        SinglyNode temp, p;
        p = last.next;
    do
    {
        if (p.data == item){
            temp = new SinglyNode();
            temp.data = data;
            temp.next = p.next;
            p.next = temp;
 
            if (p == last)
                last = temp;
            return last;
        }
        p = p.next;
    } while(p != last.next);
 
    System.out.println(item + " not present in the list.");
    return last;
    }
}
