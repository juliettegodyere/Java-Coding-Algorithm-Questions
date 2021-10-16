package String.Problems;

//Question: https://practice.geeksforgeeks.org/problems/remove-character3815/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=1&query=category[]StringsproblemStatusunsolvedpage1category[]Strings
public class RemoveSpaces {
    static String modify(String S){
        // your code here
        String str = "";
        for (int i = 0; i < S.length(); i++){
            if(S.charAt(i) == ' '){
                continue;
            }
            str = str + S.charAt(i);
        }

        return str;
    }
    public static void main(String args[]) { 
        String string1 = "g f g";
        System.out.println(modify(string1));
     } 
}
