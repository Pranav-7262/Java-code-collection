package Arrays;
import java.util.Arrays;

public class MinRemovalToBalance {
    public static void main(String[] args) {
        int []arr = {2,1,5};
        System.out.println(minRemoval(arr,2));
    }
    public static int minRemoval(int[] nums, int k) {
        int count = 0;
        int left = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i] > (long)k*nums[left]) {
                left++;
            }
            count = Math.max(count, i - left + 1);
        }
        return n - count;
    }
}
