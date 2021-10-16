package Array.Problems;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/maximize-toys0331/1
public class MaximizeToys {
    static int toyCount(int N, int K, int arr[]){
        // code here
        int count = 0;
        Arrays.sort(arr);
       for(int i = 0; i < N; i++){
        System.out.println("The value of K: " + K + " The value of count " + count);
           if(arr[i] <= K){
               count++;
               K = K - arr[i];
            //    System.out.println(K);
           }
       }
       return count;
    }
    //Accepted code
    static int toyCount2(int N, int K, int arr[]){
        // code here
        int count = 0;
        int sum = 0;
        Arrays.sort(arr);
       for(int i = 0; i < N; i++){
        System.out.println("The value of Sum: " + sum + " The value of count " + count);
           if(sum + arr[i] <= K){
               count++;
               sum = sum + arr[i];
            //    System.out.println(K);
           }
       }
       return count;
    }
    public static void main(String[] args) {
        int a[] = {1, 12, 5, 111, 200, 1000, 10};
        int size = a.length;
        int k = 50;
        System.out.println("Quadratic time for Frequencies of array elements");
        // Print keys and values
        System.out.println(toyCount2(size, k, a));
        System.out.println(toyCount(size, k, a));
    }
}
// k =100
// N = 3
// 20, 30, 50
// i = 0;
// if 20 <= 100 yes
// count = 1
// k = k - i; 
// k = 80
// i = 1
// if 30 <= 80 yes
// count = 2
// k = k - i;
// k = 50;
// i = 2
// if 50 <= 50
// count = 3
// k = k - i
// k = 0
// i = 3
