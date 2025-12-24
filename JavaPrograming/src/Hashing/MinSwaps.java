package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinSwaps {
    public static void main(String[] args) {
     int []arr1= {1,2,3} ;
     int []arr2 = {3,2,1};
        System.out.println(minSwaps(arr1 , arr2));
    }
    public static int minSwaps(int[] nums, int[] forbidden) {

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == forbidden[i]) {
                list.add(i);
            }
        }
        if(list.isEmpty()) return 0;
        Map<Integer, Integer> Nums = new HashMap<>();
        Map<Integer, Integer> Forbidden = new HashMap<>();

        for(int i=0;i<n;i++){
            Nums.put(nums[i], Nums.getOrDefault(nums[i], 0) + 1);
            Forbidden.put(forbidden[i], Forbidden.getOrDefault(forbidden[i], 0) + 1);
        }
        for(int key : Nums.keySet()) {
            int total = Nums.get(key);
            int forbiddenSlots = Forbidden.getOrDefault(key, 0);
            if (total > n - forbiddenSlots) {
                return -1;
            }
        }
        if (list.size() == 1) {
            int i = list.get(0);
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                if (nums[j] != forbidden[i] && nums[i] != forbidden[j]) {
                    return 1;
                }
            }
            return -1;
        }
        return (list.size() + 1) / 2;
    }
}
