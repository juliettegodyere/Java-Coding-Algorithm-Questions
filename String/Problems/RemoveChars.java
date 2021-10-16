package String.Problems;

import java.util.*;

//Questions: https://practice.geeksforgeeks.org/problems/remove-spaces0128/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=1&query=category[]StringsproblemStatusunsolvedpage1category[]Strings
public class RemoveChars {

    static String removeChars(String string1, String string2){
        // code here
        String str = "";

        Map<Integer, Character> map = new HashMap<Integer, Character>();

        for (int i = 0; i < string2.length(); i++){
            map.put(i, string2.charAt(i));
        }

        for (int i = 0; i < string1.length(); i++){
            if(map.containsValue(string1.charAt(i))){
                continue;
            }else{
                str+=string1.charAt(i);
            }
        }
        return str;
    }

    public static void main(String args[]) { 
        String string1 = "occurrence";
       String  string2 = "car";
        System.out.println(removeChars(string1, string2));
     } 
    
}
