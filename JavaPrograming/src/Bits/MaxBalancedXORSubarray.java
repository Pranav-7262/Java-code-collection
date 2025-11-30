package Bits;

import java.util.HashMap;
import java.util.Map;

public class MaxBalancedXORSubarray {
    public static void main(String[] args) {
       int []arr = {3,1,3,2,0};
        System.out.println(maxBalancedSubarray(arr));
    }

    public static int maxBalancedSubarray(int[] nums) {
        int n = nums.length;
        Map<String,Integer> map = new HashMap<>();
        int xor = 0, balance = 0, maxlen = 0;
        map.put("0#0" , -1);

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            if(nums[i] % 2 == 0) {
                balance++;
            }else {
                balance--;
            }
            String key = xor + "#" + balance;
            if(map.containsKey(key)) {
                maxlen = Math.max(maxlen , i - map.get(key));
            }else {
                map.put(key , i);
            }
        }
        return maxlen;
    }
}
