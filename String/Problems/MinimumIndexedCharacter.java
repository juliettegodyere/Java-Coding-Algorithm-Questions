package String.Problems;

import java.util.*;

public class MinimumIndexedCharacter {
    // Code passed https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1
    static int printMinIndexChar(String str, String patt) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        int m = str.length();
        int n = patt.length();

        for (int i = 0; i < m; i++)
            if (!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), i);

        for (int i = 0; i < n; i++)
        
            if (hm.containsKey(patt.charAt(i)) && hm.get(patt.charAt(i)) < minIndex)
                minIndex = hm.get(patt.charAt(i));

        // print the minimum index character
        if (minIndex != Integer.MAX_VALUE)
            return minIndex;

        // if no character of 'patt' is present in 'str'
        else
            return -1;
    }

    // Driver Method
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
       System.out.println(printMinIndexChar(str, patt));
    }
}
