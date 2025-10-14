package SlidingWindow;

public class LongestSubaarayAfterDeleteOneNum {
    public static void main(String[] args) {
        int []arr  = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int start = 0 , zeroCount = 0;
        int maxlen = -1;

        for(int end=0;end<n;end++) {
            if(nums[end] == 0){
                zeroCount++;
            }
            while(zeroCount > 1) {
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxlen = Math.max(maxlen , end-start);
        }
        return maxlen;
    }
}
