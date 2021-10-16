package Recursion.problem;

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.tutorialcup.com/leetcode-solutions/combination-sum-leetcode-solution.htm
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0)
            return;
        else if (remain == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] nums = { 2, 3, 6, 7 };
        List<List<Integer>> output = combinationSum(nums, 7);
        for (List<Integer> x : output) {
            for (Integer y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
