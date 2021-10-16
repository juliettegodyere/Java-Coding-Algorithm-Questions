// package String.Problems;

// import java.util.ArrayList;

// public class AllPermutation {
//     //This will print all permutation of a string
//     static ArrayList<Integer> AllPermutation(String str, String ans){
//         ArrayList<String> res = new ArrayList<String>();

//         if(str.length() == 0){
//            // System.out.println(ans + " ");
//            res.add(str);
//         }
//         int n = str.length();
//         for(int i = 0; i < n; i++){
//             char ch = str.charAt(i);

//             String ros = str.substring(0, i) + str.substring(i + 1);
//             AllPermutation(ros, ans + ch);
//         }
//     }

//    static  void permute(String str, int l, int r) { 
//         if (l == r) 
//             System.out.println(str); 
//         else
//         { 
//             for (int i = l; i <= r; i++) 
//             { 
//                 str = swap(str,l,i); 
//                 permute(str, l+1, r); 
//                 str = swap(str,l,i); 
//             } 
//         } 
//     } 
  
//     static String swap(String a, int i, int j) 
//     { 
//         char temp; 
//         char[] charArray = a.toCharArray(); 
//         temp = charArray[i] ; 
//         charArray[i] = charArray[j]; 
//         charArray[j] = temp; 
//         return String.valueOf(charArray); 
//     } 

//     //This will print only distict permutations of a string
//     static void distinctPermutation(String str, String ans){
//         if(str.length() == 0){
//             System.out.println(ans + " ");
//             return;
//         }
//         int n = str.length();
//         boolean alpha[] = new boolean[26];

//         for(int i = 0; i < n; i++){
//             char ch = str.charAt(i);

//             String ros = str.substring(0, i) + str.substring(i + 1);
//             if(alpha[ch - 'a'] == false){
//                 distinctPermutation(ros, ans + ch);
//             }
//             alpha[ch - 'a'] = true;
//         }
//     }
//     public static void main(String[] args){
//     // {
//     //     String s = "geek";
 
//     //     AllPermutation(s, " ");
//     //     System.out.println("print distict values");
//     //     distinctPermutation(s, " ");
//         String str = "ABC"; 
//         int n = str.length(); 
//         permute(str, 0, n-1); 

//     }

// }
