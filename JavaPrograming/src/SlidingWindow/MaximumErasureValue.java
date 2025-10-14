package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int [] arr = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(arr));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int sum = 0 ,  result =0;
        Set<Integer> set = new HashSet<>();
        for (int end = 0; end < n; end++) {

            while (set.contains(nums[end])){
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            sum += nums[end];
            set.add(nums[end]);
            result = Math.max(result,sum);
        }
        return result;
    }
}
