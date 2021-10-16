package String.Problems;

public class ImplementStrstr {
    //Questions: https://practice.geeksforgeeks.org/problems/implement-strstr/1/?category[]=Strings&category[]=Strings&page=2&query=category[]Stringspage2category[]Strings
    static int strstr(String s, String x){
       // Your code here
       for (int i = 0; i < s.length(); i++){
        String str = "";
           for (int j = i; j < s.length(); j++){
             str = str + ""+s.charAt(j);
             System.out.println(str);
             if(str.equals(x)){
                 return i;
             }
             if(str.length()>x.length()){
                 break;
             }
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "For";

        System.out.println(strstr(s, x));
    }
}
