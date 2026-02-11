package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
    int []arr = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;


            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if(sum < target) {
                    left++;
                } else if(sum > target) {
                    right--;
                }
                else {
                    return sum;
                }
            }
        }
        return closest;
    }
}
