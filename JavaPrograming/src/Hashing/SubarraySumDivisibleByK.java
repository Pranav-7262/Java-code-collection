package Hashing;

import java.util.HashMap;

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {
  int [] arr = {4,5,0,-2,-3,1};
  int k = 5;
        System.out.println(subarraysDivByK(arr,k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0;
        for (int i = 0; i < n; i++) {
            sum = (sum + nums[i]) % k;
            if (sum < 0) sum += k;
            if(map.containsKey(sum)){
                ans += map.get(sum);
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
        }
        return ans;
    }
}
