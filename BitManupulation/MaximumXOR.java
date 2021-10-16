//Find the maximum subarray XOR in a given array
package BitManupulation;

public class MaximumXOR {
    static int maxSubarrayXOR(int arr[], int n) { 
        int ans = Integer.MIN_VALUE; 
       
        // Pick starting points of subarrays 
        for (int i=0; i<n; i++) { 
                // to store xor of current subarray    
            int curr_xor = 0;  
       
            // Pick ending points of subarrays starting with i 
            for (int j=i; j<n; j++) 
            { 
                curr_xor = curr_xor ^ arr[j]; 
                ans = Math.max(ans, curr_xor); 
            } 
        } 
        return ans; 
    } 
    //Source https://www.youtube.com/watch?v=tmakGVOGV3A
    static int maxSubarrayKadane(int arr[], int n){
        int max = arr[0];
        for(int i = 1; i < n; i++){
           arr[i] = Math.max(arr[i], arr[i] ^ arr[i - 1]);
           max = Math.max(max, arr[i]);
        }
        
        return max;
    }
       
    // Driver program to test above functions 
    public static void main(String args[]) 
    { 
        int arr[] = {8, 1, 2, 12}; 
        int n = arr.length; 
        System.out.println("Max subarray XOR is " +  maxSubarrayXOR(arr, n)); 
        System.out.println("Kadane Max subarray XOR is " +  maxSubarrayKadane(arr, n)); 
    } 
    
}
//This solves the problem but the time complexity is O(n^2) but the expected time is O(n)
