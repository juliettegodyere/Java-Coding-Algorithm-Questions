package String.Problems;

import java.util.*;

public class RepeatedCharacters {

    static void duplicateValues (String str){
        char[] character = str.toCharArray();
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (Character ch: character){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet){
            // Character getKey = entry.getKey();
            // Integer getValue = entry.getValue();

            if(entry.getValue() > 1){
                System.out.println("The key is: " + entry.getKey() + " the value is : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "Programming";
 
       duplicateValues(str);
    }
    
}
