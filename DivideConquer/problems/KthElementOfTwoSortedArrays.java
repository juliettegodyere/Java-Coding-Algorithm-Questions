package DivideConquer.problems;

public class KthElementOfTwoSortedArrays {
    //Question https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
    // Basic method. Passed all test cases
    public static long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int d = 0, i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                d++;
                if (d == k)
                    return arr1[i];
                i++;
            } else {
                d++;
                if (d == k)
                    return arr2[j];
                j++;
            }
        }

        while (i < n) {
            d++;
            if (d == k)
                return arr1[i];
            i++;
        }

        while (j < m) {
            d++;
            if (d == k)
                return arr2[j];
            j++;
        }
        return -1;
    }
    //Divide and conquer
    static int kth(int arr1[], int arr2[], int m, int n, int k, int st1, int st2) {
       return 1;
    }

    // Driver code
    public static void main(String[] args) {
        int A[] = { 2, 3, 6, 7, 9 };
        int B[] = { 1, 4, 8, 10 };
        int k = 5;
        System.out.println(kthElement(A, B, 5, 4, k));
    }
}
