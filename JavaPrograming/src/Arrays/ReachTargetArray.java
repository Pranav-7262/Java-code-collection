package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class ReachTargetArray {
    public static void main(String[] args) {
    int []nums = {1,2,3};
    int []target = {2,1,3};
        System.out.println(minOperations(nums,target));

    }
    public static int minOperations(int[] nums, int[] target) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(nums[i] != target[i]) {
                map.computeIfAbsent(nums[i] , k -> new ArrayList<>()).add(i);
            }
        }
        int op=0;
        for(int key : map.keySet()) {
            List<Integer> indices = map.get(key);
            if(indices.isEmpty()) continue;

            op++;
        }

        return op;
    }
}
