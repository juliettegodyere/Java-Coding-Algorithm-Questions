package Stack.problem;

import java.util.*;
//Solution to 132 patter https://leetcode.com/problems/132-pattern/discuss/94089/Java-solutions-from-O(n3)-to-O(n)-for-%22132%22-pattern-(updated-with-one-pass-slution)
//Question https://practice.geeksforgeeks.org/problems/355f731797ea1acbd5ab698b19eb1c3c469aa837/1
public class The123Pattern {
    //I. Naive O(n^3) solution
    static boolean find132patternNaive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    System.out.println(nums[i] + " " +nums[j] +  " " + nums[k]);
                    // System.out.println("Before the condition");
                    // if (nums[i] < nums[k] && nums[k] < nums[j]) {
                    //     System.out.println(nums[i] + " " +nums[j] +  " " + nums[k]);
                    //     return true;
                    // }                        
                }
            }
        }
        return false;
    }

    //Optimized O(n) solution
    public boolean find132patternOptimized3(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
    
        for (int i = 1; i < nums.length; i++) {
            arr[i] = Math.min(nums[i - 1], arr[i - 1]);
        }
        
        for (int j = nums.length - 1, top = nums.length; j >= 0; j--) {
            if (nums[j] <= arr[j]) continue;
            while (top < nums.length && arr[top] <= arr[j]) top++;
            if (top < nums.length && nums[j] > arr[top]) return true;
            arr[--top] = nums[j];
        }
            
        return false;
    }
    //-- One-pass O(n) solution
    public boolean find132patternOptimized4(int[] nums) {
        int n = nums.length, top = n, third = Integer.MIN_VALUE;
    
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (top < n && nums[i] > nums[top]) third = nums[top++];
            nums[--top] = nums[i];
        }
        
        return false;
    }
    //Passed
    public static boolean find132patternStack(int[] nums, int N) {
        if(N < 3){
            return false;
        }
        int[] preMin = new int[N];
        preMin[0]=nums[0];
        for(int i = 1; i < N; i++){
            preMin[i] = Math.min(preMin[i-1], nums[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = N-1; i >=0; i--){
            if(nums[i] > preMin[i]){
                while(stack.empty() == false && stack.peek() <= preMin[i]){
                    stack.pop();
                }
                while(stack.empty() == false && stack.peek() < nums[i]){
                    return true;
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args){
    
    // Input
    int arr[] = { 4, 7, 11, 5, 13, 2 };
    int size = arr.length;

    System.out.println(find132patternStack(arr, size));
}
    
}

// i       j       k
// min     max     medium

// 4, 7, 11, 5, 13, 2
// i  j  k  -  -  -       => 4 7 11
// i  j  -  k  -  -       => 4 7 5*
// i  j  -  -  k  -       => 4 7 13
// i  j  -  -  -  k       => 4 7 2
// i  -  j  k  -  -       => 4 11 5*
// i  -  j  -  k  -       => 4 11 13
// i  -  j  -  -  k       => 4 11 2
// -  i  j  k  -  -       => 7 11 5
// -  i  j  -  k  -       => 7 11 13
// -  i  j  -  -  k       => 7 11 2
// -  i  -  j  k  -       => 7  5 13
// -  i  -  -  j  k       => 7 13 2
// -  -  i  j  k  -       => 11 5 13
// -  -  i  -  j  k       => 11 13 2
// -  -  -  i  j  k       => 5 13 2
