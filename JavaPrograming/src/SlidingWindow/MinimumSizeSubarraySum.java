package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
     int []arr = {2,3,1,2,4,3};
     int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int left = 0;
       int val_sum = 0;
       int minlength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            val_sum = val_sum+nums[i];

            while (val_sum>=target){
               minlength = Math.min(minlength,i-left+1);
               val_sum = val_sum-nums[left];
               left++;
            }
        }
//        return minlength == Integer.MAX_VALUE ? 0 : minlength;
        if (minlength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minlength;
        }


    }
}
