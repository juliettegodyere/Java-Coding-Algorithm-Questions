package String.Problems;

import java.util.*;
//Question: https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=3&query=category[]StringsproblemStatusunsolvedpage3category[]Strings
public class NonRepeatingCharacter {
    static char nonrepeatingCharacter(String S) {
        // Your code here
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i))+1);
            } else {
                map.put(S.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("The key is: " + entry.getKey() + " the value is : " + entry.getValue());
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "zxvczbtxyzvy";

        System.out.println(nonrepeatingCharacter(str));
    }
}
