package Bits;

import java.util.Arrays;

public class MaxXORforEachQuery {
    public static void main(String[] args) {
  int [] arr = {0,1,1,3};
        System.out.println(Arrays.toString(getMaximumXor(arr,2)));
    }
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int [] ans = new int[n];
        int maxVal = (1 << maximumBit) - 1;
        int total = 0;
        for(int num : nums) {
            total ^= num;
        }
        for(int i=0;i<n;i++) {
            ans[i] = total ^ maxVal;
            total ^= nums[n -1 -i];
        }
        return ans;
    }

}
