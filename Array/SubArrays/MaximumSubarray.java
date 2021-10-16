package Array.SubArrays;

public class MaximumSubarray{
    //Naive
    static int maxSubarrayBrute(int arr[], int n) { 
        int maxValue = Integer.MIN_VALUE; 
        int currenvalue ;
       
        for (int i=0; i<n; i++) { 
            currenvalue = 0;
            for (int j=i; j<n; j++) { 
                currenvalue = currenvalue + arr[j]; 
                if(maxValue < currenvalue){
                    maxValue = currenvalue;
                }
            } 
        } 
        return maxValue; 
    } 
    //Efficient
    static int maxSubarrayKadane(int arr[], int n){
        int max = arr[0];
        for(int i = 1; i < n; i++){
            // System.out.println("arr[i]1: " + arr[i]);
           arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
           System.out.println("arr[i]: " + arr[i]);
           max = Math.max(max, arr[i]);
           System.out.println("max: " + max);
        }
        
        return max;
    }
    static int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        
        for(int i = 0; i < n; i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far < max_ending_here){
               max_so_far = max_ending_here; 
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    public static void main(String args[]) 
    { 
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        int n = arr.length; 
        // System.out.println("Brute Max subarray is " +  
        // maxSubarrayBrute(arr, n)); 
        System.out.println("Kadane Max subarray is " +  
        maxSubarrayKadane(arr, n)); 
        // System.out.println("More ptimization Max subarray is " +  
        // maxSubarraySum(arr, n)); 
    } 
}
//Brute max sub array time complexity is O(n^2) so we need to optimize further

