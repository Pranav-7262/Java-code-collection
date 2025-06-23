package Arrays;

import java.util.Arrays;

public class MaximumAscendingSubarray {
    public static void main(String[] args) {
        int []arr = {10,20,30,5,10,50};
        System.out.println(Arrays.toString(maxAscendingSum(arr)));
    }
    public static int[] maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int maxsum = sum;
        if (n==1){
            return nums;
        }
        for (int i = 1; i < n; i++) {
            if (nums[i]>nums[i-1]){
                sum = sum+nums[i];
            }
            else {
                sum = nums[i];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return new int[]{maxsum};
    }
}
