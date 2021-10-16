package String.Problems.easy;

import java.util.ArrayList;
//https://leetcode.com/problems/truncate-sentence/
public class TruncatSentence {
    public static String truncateSentence(String s, int k) {
      
        ArrayList<String> arr = new ArrayList<>();
        String truncStr = "";
        int j = 0, i;
        for(i = 0; i < s.length(); i++){
           for(j = i; j < s.length(); j++){
               if(s.charAt(j) == ' '){
                    arr.add(s.substring(i, j));
                    i = j;
               }
               
           }
           if(j == s.length()){
                arr.add(s.substring(i, j));
                break;
           }
                
        }
        for(int m = 0; m < k; m++){
            truncStr = truncStr + arr.get(m);           
        }
        return truncStr;
    }
    // accepted by letcode
    public static String truncateSentence2(String s, int k) {
        String[] st = s.split(" ");
        String truncStr = "";
        String []str1=new String[k]; 

        for(int i = 0; i < k; i++){
           str1[i] = st[i];          
        }
        truncStr=String.join(" ",str1);
        return truncStr;
    }
    public static void main(String[] args){
        String str = "What is the solution to this problem"; 
        int k = 4;
        System.out.println(truncateSentence(str, k));
        System.out.println(truncateSentence2(str, k));
    
        }
}