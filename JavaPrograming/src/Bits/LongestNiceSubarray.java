package Bits;

public class LongestNiceSubarray {
    public static void main(String[] args) {
    int [] arr = {1,3,8,48,10};
        System.out.println(longestNiceSubarray(arr));
    }
    public static int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int left = 0 , maxlen = 0 , bit = 0;
        for(int i=0;i<n;i++) {
            while((bit & nums[i]) != 0) {
                bit = bit ^ nums[left];
                left++;
            }
            bit = bit | nums[i];
            maxlen = Math.max(maxlen , i - left + 1);
        }
        return maxlen;
    }
}
