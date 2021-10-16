package Array.Problems;

public class BalancedArray {
    static long minValueToBalance(long a[] ,int n){
        int mid = n/2;
        long rightSum = 0;
        long leftSum = 0;
        for(int i = 0; i < mid; i++){
            leftSum = leftSum + a[i];
        }
        for(int i = mid; i < n; i++){
            rightSum = rightSum + a[i];
        }
        long diff = 0;
        if(leftSum > rightSum){
            diff = leftSum - rightSum;
        }else if (rightSum > leftSum){
            diff = rightSum - leftSum;
        }else{
            diff = 0;
        }
        return diff;

    }

    public static void main(String args[]) {
        long arr[] = {1, 2, 1, 2, 1, 3};
        int N = arr.length;

        System.out.println("The difference between the right array elements and the left array elements is: " + minValueToBalance(arr, N));
    }
    
}
