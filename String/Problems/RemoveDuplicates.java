package String.Problems;
//Question: https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings

public class RemoveDuplicates {
    //Passed all test cases
    static String removeDups(String S) {
        // code here
        String str = "";

        for (int i = 0; i < S.length(); i++){
            if(str.contains(""+S.charAt(i))){
                continue;
            }else{
                str+=S.charAt(i);
            }
        }
        return str;
    }

    public static void main(String args[]) { 
        String S = "gfg";
        System.out.println(removeDups(S));
     } 
    
}
