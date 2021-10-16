package Stack;

public class UsingArray {
    int MAX = 1000;
    int[] arr = new int[MAX];
    int top;

    boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }

    UsingArray(){
        top = -1;
    }

     boolean push(int value){
        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
        return true;
    }
     int peek(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top];
    }
     int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        int popped = arr[top--];
        return popped;
    }
    

}
class Main {
    public static void main(String args[])
    {
        UsingArray s = new UsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
