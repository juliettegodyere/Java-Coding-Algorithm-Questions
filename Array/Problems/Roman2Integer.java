package Array.Problems;

//https://leetcode.com/problems/roman-to-integer/
public class Roman2Integer {
   
        
        public static int romanToInt(String s) {
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                String str = "";
               if(i+1 < s.length()){
                    str = s.charAt(i) + "" +s.charAt(i+1);
               }
                if(str.equals("IV")){
                    sum = sum + 4;
                    i++;
                }else if(str.equals("IX")){
                    sum = sum + 9;
                    i++;
                }else if(str.equals("XL")){
                    sum = sum + 40;
                    i++;
                }else if(str.equals("XC")){
                    sum = sum + 90;
                    i++;
                }else if(str.equals("CD")){
                    sum = sum + 400;
                    i++;
                }else if(str.equals("CM")){
                    sum = sum + 900;
                    i++;
                }else if(s.charAt(i) == 'I'){
                    sum = sum + 1;
                }else if(s.charAt(i) == 'V'){
                    sum = sum + 5;
                }else if(s.charAt(i) == 'X'){
                    sum = sum + 10;
                }else if(s.charAt(i) == 'L'){
                    sum = sum + 50;
                }else if(s.charAt(i) == 'C'){
                    sum = sum + 100;
                }else if(s.charAt(i) == 'D'){
                    sum = sum + 500;
                }else if(s.charAt(i) == 'M'){
                    sum = sum + 1000;
                }
            }
            return sum;
        }
    public static void main(String args[]) {
        String s = "MCMXCIV";
       
        System.out.println(romanToInt(s));
 
    }
}
