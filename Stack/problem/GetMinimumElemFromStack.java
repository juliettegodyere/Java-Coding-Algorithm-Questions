package Stack.problem;

import java.util.Stack;

//Task https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1
// The following approach did not pass all test cases
public class GetMinimumElemFromStack {
    int minEle;
    Stack<Integer> s;
    public GetMinimumElemFromStack(){
        s =new Stack<Integer>();
    }
    /*returns min element from stack*/
    int getMin(){
	// Your code here
	    if(s.isEmpty()){
	        return -1;
	    }else{
	        return minEle;
	    }
    }
    
    /*returns poped element from stack*/
    int pop(){
	// Your code here
	    if(s.isEmpty()){
	        return -1;
	    }
	    Integer top = s.pop();

	  if(top >= minEle){
	        return top;
	    }else{
	       minEle = 2*minEle - top;
	       return top;
	    }
	     
    }

    /*push element x into the stack*/
    void push(int x){
	// Your code here
	    if(s.isEmpty()){
	        s.push(x);
	        minEle = x;
	    }
	    if(x >= minEle){
	       s.push(x);
	    }else{
	        s.push(2*x - minEle);
            minEle = x;
	    }
	    
    }	
}
