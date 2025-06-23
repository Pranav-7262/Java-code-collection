package Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max_sum = nums[0];
        for (int i = 0; i < n; i++) {

            sum = sum + nums[i];
            if (max_sum < sum) {
                max_sum = sum;
            }

                if (sum < 0) {
                    sum = 0;
                }
        }
        return max_sum;
    }
}
