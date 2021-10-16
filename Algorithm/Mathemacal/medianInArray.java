package Algorithm.Mathemacal;

import java.util.Arrays;

////https://www.geeksforgeeks.org/median/
public class medianInArray {
    static double getMedian(int ar1[], int n)
    {  
        Arrays.sort(ar1);
        if(n % 2 == 0){
            return (double)(ar1[n/2] + ar1[(n-1)/2])/2.0;
        }
            
        return (double)ar1[n/2];
        
    }
      
    /* Driver program to test above function */
    public static void main (String[] args)
    {
        int ar1[] = {1, 3, 4, 2, 7, 5, 8, 6};
        int n = ar1.length;      
        System.out.println("Median is " + getMedian(ar1, n));
    }   
}
