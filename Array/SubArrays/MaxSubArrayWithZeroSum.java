package Array.SubArrays;

import java.util.*;
//Questions: https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
public class MaxSubArrayWithZeroSum {
    //My approach
    static int bruteForceApproach(int arr[], int n) {
        // Your code here
        List<Integer> list = new ArrayList<Integer>();
        int maxlen = list.size();

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            // System.out.println("arr[i]; " + arr[i]);
            list.clear();
            list.add(arr[i]);
            for (int j = i + 1; j < n; j++) {
                // System.out.println("arr[j]; " + arr[j]);
                sum += arr[j];
                // System.out.println("sum; " + sum);
                list.add(arr[j]);
                if (sum == 0) {
                    if (list.size() > maxlen) {
                        maxlen = list.size();
                    }
                }
            }
        }
        return maxlen;
    }

    // Returns length of the maximum length subarray with 0 sum
    static int maxLen(int arr[]) {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            if (arr[i] == 0 && max_len == 0)
                max_len = 1;

            if (sum == 0)
                max_len = i + 1;

            // Look this sum in hash table
            Integer prev_i = hM.get(sum);

            // If this sum is seen before, then update max_len
            // if required
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else // Else put this sum in hash table
                hM.put(sum, i);
        }

        return max_len;
    }

    static int maxLen2(int arr[], int n) {
        int max_len = 0;

        // Pick a starting point
        for (int i = 0; i < n; i++) {
            // Initialize curr_sum for every
            // starting point
            int curr_sum = 0;

            // try all subarrays starting with 'i'
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];

                // If curr_sum becomes 0, then update
                // max_len
                if (curr_sum == 0)
                    max_len = Math.max(max_len, j - i + 1);
            }
        }
        return max_len;
    }

    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        System.out.println("Brute Max subarray is ");
        System.out.println(bruteForceApproach(arr, n));
        System.out.println("Heap Max subarray is ");
        System.out.println(maxLen(arr));
    }
}
