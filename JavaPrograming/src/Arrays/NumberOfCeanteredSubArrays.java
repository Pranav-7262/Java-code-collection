package Arrays;

import java.util.HashSet;
import java.util.Set;

public class NumberOfCeanteredSubArrays {
    public static void main(String[] args) {
      int [] arr = {-1,1,0};
        System.out.println(centeredSubarrays(arr));
    }
    public static int centeredSubarrays(int[] nums) {
        int count =0;
        int n = nums.length;

        for(int i=0;i<n;i++) {
            int sum = 0;
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++) {
                sum +=  nums[j];
                set.add(nums[j]);
                if(set.contains(sum)) {
                    count++;
                }
            }
        }
        return count;
    }
}
