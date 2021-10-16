package Maths.problem;

import java.util.*;

public class KthSmallestFactor {
      //GIven two positive integers N and K. You have to find the Kth smallest factor of N. A factor of N is a positive integer which divides N. Output the Kth smallest factor of N if it exists otherwise print -1.
    //https://practice.geeksforgeeks.org/problems/kth-smallest-factor2345/1

    //Naive Approach
    //Accpted by Geeksforgeeks
    public static int kThSmallestFactorNaive(int n, int K) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                // System.out.println("The value of i is : " + i);
                list.add(i);
            }
        }
        System.out.println("The size of the array is : " + list.size());
        if(K > list.size()){
            return -1;
        }else{
            return list.get(K-1); 
        }
    }

    static int kThSmallestFactor(int n , int K) {
        // code here
        Vector<Integer> list = new Vector<Integer>();
        
        for (int i=1; i<=Math.sqrt(n); i++){
            if (n%i==0){
                System.out.println("The value after modulus: " + i);
                list.add(i);
                if (i != Math.sqrt(n)){
                    System.out.println("Add when i not eauals sqaure root: " + n/i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println("The size of the array is : " + list.size());
        if(K > list.size()){
            return -1;
        }else{
            return list.get(K-1); 
        }
    }
    public static void main(String args[]){
        int n = 4;
        int k = 2;
        System.out.println("The Square root method: ");
        System.out.println(kThSmallestFactor(n, k));
        System.out.println("The Naive method: ");
        System.out.println(kThSmallestFactorNaive(n, k));
    }
    
}
