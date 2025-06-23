package Hashing;

import java.util.HashMap;

public class SubArraySumK {
    public static void main(String[] args) {
     int [] arr = {1,2,3};
        System.out.println(subarraySum(arr,3));
    }
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k)){
                res += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
