package Searching.problem;
//https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1
//https://www.techiedelight.com/find-first-or-last-occurrence-of-a-given-number-sorted-array/
class pair  
{  
    long min, max;  
    public pair(long first, long second)  
    {  
        this.min = first;  
        this.max = second;  
    }  
}
public class LeftMostRightMostIndex {
    public static long leftMostIndex(long A[], long x){
        // `x` doesn't exist in the array
        int left = 0;
        int right = A.length - 1;
        long result = -1;
 
       while (left <= right){

           int mid = (left + right) / 2;

           if (x == A[mid]) {
            result = mid;
            right = mid - 1;
           }else if (x < A[mid]) {
               right = mid - 1;
           }else {
               left = mid + 1;
           }
       }

       // `x` doesn't exist in the array
       return result;
    }
    public static long rightMostIndex(long A[], long x){
        // `x` doesn't exist in the array
        int left = 0;
        int right = A.length - 1;
        long result = -1;
 
       while (left <= right){

           int mid = (left + right) / 2;

           if (x == A[mid]) {
            result = mid;
            left = mid + 1;
           }else if (x < A[mid]) {
               right = mid - 1;
           }else {
               left = mid + 1;
           }
       }

       // `x` doesn't exist in the array
       return result;
    }
    public static pair indexes(long v[], long x)
    {
        // Your code goes here
        return new pair(leftMostIndex(v, x), rightMostIndex(v, x));
    }
    public static void main(String[] args)
    {
        long[] A = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        long key = 5;
 
        // long leftindex = leftMostIndex(A, key);
        // long rightindex = rightMostIndex(A, key);
 
        // if (leftindex != -1)
        // {
        //     System.out.println("The first occurrence of element " + key +
        //                     " is located at index " + leftindex);
        // }
        // else {
        //     System.out.println("Element not found in the array");
        // }
        // if (rightindex != -1)
        // {
        //     System.out.println("The first occurrence of element " + key +
        //                     " is located at index " + rightindex);
        // }
        // else {
        //     System.out.println("Element not found in the array");
        // }
         pair result = indexes(A, key);
        System.out.println(result.min + " I am the left index");
        System.out.println(result.max + " I am the right index");
    }
}
