package Arrays;

import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
        int []nums={1,2,3,6};
        boolean ans=containsDuplicate(nums);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);//sorting arrays
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
