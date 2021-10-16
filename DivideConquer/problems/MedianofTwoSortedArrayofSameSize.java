package DivideConquer.problems;

public class MedianofTwoSortedArrayofSameSize {
    // function to calculate median
    // https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        // Your Code Here

        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = b[0];
                break;
            }else if (j == n) {
                m1 = m2;
                m2 = a[0];
                break;
            }
            if (a[i] <= b[j]) {
                /* Store the prev median */
                m1 = m2;
                m2 = a[i];
                i++;
            } else {
                /* Store the prev median */
                m1 = m2;
                m2 = b[j];
                j++;
            }

        }
        return (double) (m1 + m2) / 2;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int ar1[] = { 4, 6 };
        int ar2[] = { 1, 2, 3, 5 };
        int n1 = ar1.length;
        int n2 = ar2.length;
        System.out.println("Median is " + medianOfArrays(n1, n2, ar1, ar2));
    }
}
