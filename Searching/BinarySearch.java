package Searching;

// Java implementation of recursive Binary Search
class BinarySearch {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int binarySearchRecursive(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearchRecursive(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearchRecursive(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}
    public static int binarySearchIterative(int[] A, int x)
    {
        // search space is `A[left…right]`
        int left = 0, right = A.length - 1;
 
        // loop till the search space is exhausted
        while (left <= right){
            // find the mid-value in the search space and
            // compares it with the target
 
            int mid = (left + right) / 2;
            System.out.println("I am mid: " + mid);
            // overflow can happen. Use:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;
 
            // key is found
            if (x == A[mid]) {
                System.out.println("I am equals to mid: " + mid);
                return mid;
            }
 
            // discard all elements in the right search space,
            // including the middle element
            else if (x < A[mid]) {
                right = mid - 1;
                System.out.println("The left value is now: " + right);
            }
 
            // discard all elements in the left search space,
            // including the middle element
            else {
                left = mid + 1;
                System.out.println("The right value is now: " + left);
            }
        }
 
        // `x` doesn't exist in the array
        return -1;
    }

	// Driver method to test above
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 };
		int n = arr.length;
		int x = 7;
		// int result = ob.binarySearchRecursive(arr, 0, n - 1, x);
        int result = binarySearchIterative(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
/* This code is contributed by Rajat Mishra */

