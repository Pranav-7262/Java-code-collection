package Arrays;

import java.util.*;

public class MaxProductOfThreeNums {
    public static void main(String[] args) {
        int [] arr = {-5,7,0};
        System.out.println(maxProduct(arr));
    }

    public static long maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int MAX = 100000;
        int MIN = -100000;

        long base1 = (long) nums[n -1] * nums[n -2] * nums[n -3];
        long base2 = (long) nums[0] * nums[1] * nums[n - 1];
        long best = Math.max(base1, base2);
        int[] set = { nums[0], nums[Math.min(1, n - 1)],nums[Math.min(2, n - 1)],
                nums[Math.max(0, n - 3)],
                nums[Math.max(0, n - 2)],
                nums[n - 1]
        };;

        for(int val : set) {
            long [] temp = {MAX , val};
            best = Math.max(best , computeP(nums,val,MAX));
            best = Math.max(best , computeP(nums,val,MIN));
        }
        return best;
    }
    public static long computeP(int []nums,int oldVal,int newVal) {
        List<Long> list = new ArrayList<>();
        boolean replace = false;
        for(int num : nums) {
            if(!replace && num == oldVal) {
                list.add((long)newVal);
                replace = true;
            }else {
                list.add((long)num);
            }
        }
        Collections.sort(list);
        int n = list.size();
        long a = list.get(n - 1) * list.get(n - 2) * list.get(n - 3);
        long b = list.get(0) * list.get(1) * list.get(n - 1);
        return Math.max(a,b);
    }

}
