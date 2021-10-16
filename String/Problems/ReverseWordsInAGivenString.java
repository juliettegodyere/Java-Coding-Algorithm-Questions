package String.Problems;

import java.util.*;
//Question: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=2&query=category[]StringsproblemStatusunsolvedpage2category[]Strings
public class ReverseWordsInAGivenString {
    //Passed all test cases. My solution
   static String reverseWords(String S) {
        // code here
        String str = "";
        String[] arr = S.split("[, ?.@]+");
        int N = arr.length;

        for (int i = N-1; i >= 0; i--){
            if(str == ""){
                str = str + arr[i];
            }else{
                str = str + "." + arr[i];
            }

        }
        return str;
    }
    public static void main(String[] args)
    {
        String str = "pqr.mno";
 
       System.out.println(reverseWords(str));
    }
}
