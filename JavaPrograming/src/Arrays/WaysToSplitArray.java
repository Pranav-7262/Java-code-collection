package Arrays;

public class WaysToSplitArray {
    public static void main(String[] args) {
    int []arr = {10,4,-8,7};
        System.out.println(waysToSplitArray(arr));
    }
    public static int waysToSplitArray(int[] nums) {
        long left = 0;
        long right = 0;
        for (int num:nums){
            right += num;
        }
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left>=right){
                count++;
            }
        }
        return count;
    }
}
