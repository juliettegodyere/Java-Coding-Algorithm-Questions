package DivideConquer.problems;

// A Simple Merge based O(n) solution
// to find median of two sorted arrays
class MdedianofTwoSrtedofDiffSizes{
	
    //https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        // Your Code Here

        int count;
        int i = 0;
        int j = 0;
        int m1 = -1, m2 = -1;

        if((m + n)%2 == 1){
            for (count = 0; count <= (n+m)/2; count++){
                if (i != n && j != m) {
                     m1 = (a[i] > b[j]) ? b[j++] : a[i++];
                }else if (i < n) {
                    m1 = a[i++];
                }else {
                    m1 = b[j++];
                }
            }
            return m1;
        }else{
            for(count = 0; count <= (n + m) / 2; count++){
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (a[i] > b[j]) ? b[j++] : a[i++];
                }else if (i < n){
                    m1 = a[i++];
                }else{
                    m1 = b[j++];
                }
            }
           
            return (double)(m1 + m2) / 2;
        }
    }
    
    
    // Driver code
    public static void main(String[] args){
        int ar1[] = {4,6};
        int ar2[] = {1,2,3,5};
    
        int n1 = ar1.length;
        int n2 = ar2.length;
    
        System.out.println(medianOfArrays( n1, n2,ar1, ar2));
    }
}
    
    // This code is contributed by Yash Singhal
    
