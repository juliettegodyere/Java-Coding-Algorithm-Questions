package String.Problems;

import java.util.*;
//Question: https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1/?category[]=Strings&category[]=Strings&page=2&query=category[]Stringspage2category[]Strings
public class MaximumOccuringCharacter {
    //Passed all test cases. My solution
    public static char getMaxOccuringChar(String S){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i))+1);
            } else {
                map.put(S.charAt(i), 1);
            }
        }
        int max = 0;
        char element = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue() > max){
               element = entry.getKey();
               max = entry.getValue();
           }else if(entry.getValue() ==  max){
            element = findLexicalOrder(element, entry.getKey());
           }
        }
        return element;
    }
    static char findLexicalOrder(char prev, char current){
        if(prev < current){
            return prev;
        }else{
            return current;
        }
    }

    public static void main(String[] args) {
        String str = "output";

        System.out.println(getMaxOccuringChar(str));
    }
}
