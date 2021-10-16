package Array.Problems;

class pair  
{  
    long min, max;  
    public pair(long first, long second)  
    {  
        this.min = first;  
        this.max = second;  
    }  
}

public class MinMax {
    static pair getMinMaxMyMethod(long a[], long n)  
    {
        //Write your code here
        long max = a[0];
        long min = a[0];
        
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }else if(a[i] < min){
                    min = a[i];
            }
        }
      
        return new pair(min, max);
    }
    static pair getMinMaxMethod2(long arr[], long n) {
        pair minmax = new pair(0, 0);
        int i;
 
        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
 
        /* If there are more than one elements, then initialize min
    and max*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
 
        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
 
        return minmax;
    }

    public static void main(String args[]) {
        long arr[] = {1000, 11, 445, 1, 330, 3000};
        long arr_size = arr.length;
        pair minmax = getMinMaxMyMethod(arr, arr_size);
        pair minmax2 = getMinMaxMethod2(arr, arr_size);
        System.out.printf("\nMinimum element for my solution is %d", minmax.min);
        System.out.printf("\nMaximum element for my solution is %d", minmax.max);

        System.out.printf("\nMinimum element for the simple solution is %d", minmax2.min);
        System.out.printf("\nMaximum element for the simple solution is %d", minmax2.max);
 
    }
    
}
