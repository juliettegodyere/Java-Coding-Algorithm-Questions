package String.Problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        //https://leetcode.com/problems/minimum-index-sum-of-two-lists/
       // https://www.geeksforgeeks.org/minimum-index-sum-common-elements-two-lists/
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> array = new ArrayList<String>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minValue = 0;

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                System.out.println("The sum is: " + sum);
                if (minValue < sum) {
                    minValue = sum;
                    System.out.println("Sum is larger " + list2[j]);
                    array.clear();
                    array.add(list2[j]);
                } else if (sum == minValue) {
                    array.add(list2[j]);
                    System.out.println("Sum is equal to min value " + list2[j]);
                }
            }
        }
        String[] result = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            System.out.print("Resultant array" + array.get(i));
            result[i] = array.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        // Creating list1
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] arr = findRestaurant(list1, list2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The final result: " + arr[i]);
        }
    }
}
