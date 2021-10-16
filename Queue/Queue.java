package Queue;
//https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/
public class Queue {
    //Create a Queue using an array
    int rear;
    int front;
    int capacity;
    
    int[] queue;

    Queue(int c){
        rear = 0;
        front = 0;
        capacity = c;
        queue = new int[c];
    }

    void enqueue(int data){
        if(capacity == rear){
            System.out.printf("\nQueue is full\n");
            return;
        }else{
            queue[rear] = data;
            rear++;
        }
        return;
    }
     void dequeue(){
        if(front == rear){
            System.out.printf("\nQueue is empty\n");
            return;
        }else{
            for (int i = 0; i < rear-1; i++){
                queue[0] = queue[i + 1];
            }
            if(rear < capacity){
                queue[rear] = 0;
            }
            rear--;
        }
        return;
    }
     int front(){
        if(front == rear){
            System.out.printf("\nQueue is empty\n");
            return 0;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return queue[front];
    }
     void display(){
        if(front == rear){
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (int i = front; i < rear; i++){
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        Queue q = new Queue(4);
 
        // print Queue elements
        q.display();
 
        // inserting elements in the queue
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
 
        // print Queue elements
        q.display();
 
        // insert element in the queue
        q.enqueue(60);
 
        // print Queue elements
        q.display();
 
        q.dequeue();
        q.dequeue();
        System.out.printf("\n\nafter two node deletion\n\n");
 
        // print Queue elements
        q.display();
 
        // print front of the queue
        q.front();
    }
}
