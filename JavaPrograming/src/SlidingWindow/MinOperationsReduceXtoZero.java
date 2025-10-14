package SlidingWindow;

public class MinOperationsReduceXtoZero {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4};
        System.out.println(minOperations(arr,7));
    }
    public static int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        int target = totalSum - x;
        int start = 0;
        int sum = 0;
        int maxlen = -1;

        for(int end=0;end<nums.length;end++) {

            sum += nums[end];
            while(sum > target && start <= end) {
                sum -= nums[start];
                start++;
            }
            if(sum == target) {
                maxlen = Math.max(maxlen , end-start+1);
            }
        }
        return  maxlen == -1 ? -1 : nums.length - maxlen;
    }
}
