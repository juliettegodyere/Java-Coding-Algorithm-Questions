package HashMap;

import java.util.*;
//Questions:https://practice.geeksforgeeks.org/problems/twice-counter4236/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=2&query=category[]StringsproblemStatusunsolvedpage2category[]Strings
public class TwiceCounter {
    //Passed all test cases
    public static int countWords(String list[]) {
        // code here
        int count = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                System.out.println(map.get(list[i]) + 1);
                System.out.println(list[i]);
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
        System.out.println("Iterating Hashmap...");
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            // System.out.println(m.getKey()+" "+m.getValue());
            // int value = m.getValue();
            if (m.getValue() == 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String[] string = {"Tom", "Jerry", "Thomas", "Tom", "Jerry", "Courage", "Tom", "Courage" };
        System.out.println(countWords(string));
    }
}
