package Array.SubArrays;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1
public class SubArraySum {
    static int findSubArraySumBrute(int Arr[], int N, int k){
        // code here
        int sum; 
        int count = 0;
       
        for (int i=0; i<N; i++) { 
            sum = Arr[i];
            for (int j=i + 1; j<N; j++) { 
                sum = sum + Arr[j];
                if(sum == k){
                    // System.out.println("Inside the conditiom => i : " + i + " J : " + j); 
                    // System.out.println("Inside the conditiom => Sum : " + sum + " Arr[j] : " + Arr[j]);
                    ++count;
                }
                // System.out.println("i : " + i + " J : " + j); 
                // System.out.println("Sum : " + sum + " Arr[j] : " + Arr[j]);
            }             
        } 
        return count; 
    }
    //The solution is explained here https://leetcode.com/problems/subarray-sum-equals-k/solution/
    static int maxSubarraySumEfficient(int[] nums, int n, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String args[]) { 
        int arr[] = {1, 4, 0, 0, 3, 10, 5}; 
        int n = arr.length; 
        int k = 7;
        System.out.println("Brute Max subarray is " );
        System.out.println(findSubArraySumBrute(arr, n, k)); 
        System.out.println("Mine solution Max subarray is " );
        System.out.println(maxSubarraySumEfficient(arr, n, k)); 
    } 
}
