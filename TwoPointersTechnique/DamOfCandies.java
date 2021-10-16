package TwoPointersTechnique;

//Question: https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1
//Solution: https://www.geeksforgeeks.org/maximum-water-that-can-be-stored-between-two-buildings/
public class DamOfCandies {
    static int maxCandy(int height[], int n) {
        // Your code goes here
        int start = 0;
        int end = n-1;
        int ans = 0;
        
        while(start < end){
            if(height[start] < height[end]){
                ans = Math.max(ans, height[start] * (end-start-1));
                start++;
            }else if(height[end] < height[start]){
                ans = Math.max(ans, height[end] * (end-start-1));
                end--;
            }else{
                ans = Math.max(ans, height[start] * (end-start-1));
                start++;
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int height[] = {1, 3, 4};
        int n = height.length;
        System.out.print(maxCandy(height, n));
    }
}
