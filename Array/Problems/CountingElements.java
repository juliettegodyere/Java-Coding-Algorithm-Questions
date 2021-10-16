package Array.Problems;

import java.util.*;

public class CountingElements {
    static int counting_elements(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int x = arr[i] + 1;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }

    static int counting_elements2(int[] arr){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        for(int i = 0; i < arr.length; i++){
            int x = arr[i] + 1;
            list.add(x);
        }
        for (int i = 0; i < arr.length; i++){
            if(list.contains(arr[i])){
                count++;
            }
        }
        return count;
    }
    static int counting_elements3(int[] arr){
        int count = 0;
        int j = -1;
        Map<Integer, Integer> list = new HashMap<Integer, Integer> ();
        for(int i = 0; i < arr.length; i++){
            int x = arr[i] + 1;
            list.put(j++, x);
        }
        for (int i = 0; i < arr.length; i++){
            if(list.containsValue(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int N = arr.length;

        System.out.println(counting_elements3(arr));
    }
}
