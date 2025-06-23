package Arrays;

public class LongestSubarrayMaxORMin {
    public static void main(String[] args) {
      int []nums = {1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums));
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxi = 0,increment =1 , decrement= 1;
        for (int i = 1; i < n; i++) {
            if (nums[i]>nums[i-1]){
                increment++;
                decrement=1;
            } else if (nums[i]<nums[i]) {
                decrement++;
                increment=1;
            }
            else {
                increment=1;
                decrement=1;
            }
            maxi = Math.max(maxi,Math.max(increment,decrement));
        }
        return maxi;
    }
}
