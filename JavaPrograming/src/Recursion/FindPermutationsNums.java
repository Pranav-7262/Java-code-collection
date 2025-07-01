package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindPermutationsNums {
    public static void main(String[] args) {
     int []arr = {1,2,3};
        System.out.println(permute(arr));
    }
    public  static List<List<Integer>> permute(int[] nums) {
        return generatePermutations(new ArrayList<>(), nums);
    }

    private static List<List<Integer>> generatePermutations(List<Integer>curr , int[] nums) {
        if (curr.size() == nums.length){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(curr));
            return list;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= curr.size(); i++) {
            List<Integer> newList = new ArrayList<>(curr);
            newList.add(i, nums[curr.size()]);
            result.addAll(generatePermutations(newList, nums));
        }
        return result;

    }
}
