package Array.Problems;

import java.util.*;

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++){
            if(ruleKey == "type"){
                if(items.get(i).get(0) == ruleValue){
                    count++;
                }
            }else if(ruleKey == "color"){
                if(items.get(i).get(1) == ruleValue){
                    count++;
                }
            }else if(ruleKey == "type"){
                if(items.get(i).get(2) == ruleValue){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        // String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        // List<List<String>> list = new  List<List<String>>();
        // list.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        // list.add(new ArrayList<String>(Arrays.asList("computer","silver","lenovo")));
        // list.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));

        // System.out.println(countMatches(list, "type", "color"));
    }
}
