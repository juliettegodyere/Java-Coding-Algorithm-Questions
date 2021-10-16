package Array.Problems;

import java.util.HashSet;

//https://leetcode.com/problems/two-sum/submissions/
//chrome-extension://oemmndcbldboiebfnladdacbdfmadadm/https://web.stanford.edu/class/cs9/sample_probs/TwoSum.pdf
public class TwoSum {
    //Accepted code
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i= 0; i < nums.length; i++){
            for (int j = i +1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    }
            }
        }
        return output;
    }
    // static Integer[] sumsToTarget(int[] A, int k) {
    //     HashSet<Integer> values = new HashSet<Integer>();
    //     for (int i = 0; i < A.length; i++) {
    //         if (values.contains(k - A[i])) {
    //             return Integer(values.toArray());
    //         }
    //         values.add(A[i]);
    //     }
    //     Integer[] objects = values.toArray();
    //     return ;
    // }
    public static void main(String[] args) {
        int a[] = {2,7, 11, 15};
        int target = 9;
        System.out.println("Quadratic time for Frequencies of array elements");
        // Print keys and values
        int[] output = twoSum(a, target);
       for(int i = 0; i < output.length; i++){
            System.out.print(i + " ");
       }
    }
}
