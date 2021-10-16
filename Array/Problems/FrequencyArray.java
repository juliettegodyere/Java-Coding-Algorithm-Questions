package Array.Problems;
import java.util.*;

public class FrequencyArray {
    static void frequencyArrayQuadraticTime(int[] arr, int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        int count; 
        for (int i = 0; i < n; i++){
            // Skip this element if already processed
            if (visited[i] == true)
                continue;
            count = 0;
            for (int j = i; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("key: " + arr[i] + " value: " + count);
        }
    }

    static  void frequencyArrayHashMap(int a[], int size) {
        // your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for (int i = 0; i < size; i++) {
            if (mp.containsKey(a[i])) {
                mp.put(a[i], mp.get(a[i])+1);
            }else{
                mp.put(a[i], 1);
            }
        }
        //This method works also
        int maxVal = 0;
        int maxInt = 0;
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()){
            //System.out.println(entry.getKey() + " " + entry.getValue());
            Integer key = entry.getKey();
            Integer count = entry.getValue();

            if (count > maxVal){
                maxVal = count;
                maxInt = key;
            }else if(count == maxVal){

            }
        }
       
        // for (int i : mp.keySet()) {
        //     System.out.println("key: " + i + " value: " + mp.get(i));
        // }
    }
    //Find the element that appears once
    //https://practice.geeksforgeeks.org/problems/element-appearing-once2552/1
    public static int ElementsAppearedOnce(int A[], int N)
    {
        // your code here
         HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (mp.containsKey(A[i])) {
                mp.put(A[i], mp.get(A[i])+1);
            }else{
                mp.put(A[i], 1);
            }
        }
       
        for (int i : mp.keySet()) {
            if(mp.get(i) == 1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int size = a.length;
        
        System.out.println("Quadratic time for Frequencies of array elements");
        //frequencyArrayQuadraticTime(a, size);
        // Print keys and values
        frequencyArrayHashMap(a, size);
        System.out.println(ElementsAppearedOnce(a, size));
       

    }
    
}
