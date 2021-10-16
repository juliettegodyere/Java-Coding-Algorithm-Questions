package Trie.problem;

import java.util.HashMap;
//Still oustanding
//https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1
public class MostFrequentWord {
    //Most frequent word in an array
    static  String frequencyArrayHashMap(String array[], int size) {
        HashMap<String,Integer> mp = new HashMap<String, Integer>();
        
        for (String str: array) {
            if (mp.keySet().contains(str)) {
                mp.put(str, mp.get(str)+1);
            }else{
                mp.put(str, 1);
            }
        }
        int maxVal = 0;
        String maxStr = "";
        for (HashMap.Entry<String, Integer> entry : mp.entrySet()){
            String key = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("the key: " + key + " the value: " + count);
            if (count > maxVal){
                System.out.println(count + " is greater than: " + maxVal);
                maxVal = count;
                maxStr = key;
           }else if(count == maxVal){
                System.out.println(count + " is equals : " + maxVal);
                if(maxStr.length() < key.length()){
                    System.out.println("the key length: " + key.length() + " the max str length: " + maxStr.length());
                   System.out.println("the key: " + key + " The max length before: " + maxStr);
                    maxStr = key;
                }
                System.out.println("the key: " + key + " the max length after: " + maxStr);
            }
        }
        return maxStr;
    }
    static  String frequencyArrayTrie(String array[], int size) {
        String maxStr = "";

        return maxStr;
    }

    public static void main(String[] args){
        String[] arr = {"elgefh", "elgefh", "vuxct", "elgefh", "kmrht", "elgefh", "kmrht", "kmrht", "hjfd", "hjfd", "kmrht", "vuxct", "elgefh", "mzwlcq", "kmrht"};
        int n = arr.length;
        System.out.println(frequencyArrayHashMap(arr, n) + "");
    }
}
