package Hashing;

import java.util.Collections;
import java.util.*;

public class MaxUniqueSubArraySum {
    public static void main(String[] args) {
      int [] arr = {1,2,-1,-2,1,0,-1};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] nums) {
        int sum = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set){
            if (num > 0) {
                sum += num;
            }

        }
        return sum;
    }
}
