package Arrays;

import java.util.*;

public class MaxKDistinct {
    public static void main(String[] args) {
        int[]arr = {23,55,86,78,9};
        System.out.println(Arrays.toString(maxKDistinct(arr,3)));
    }
    public static int[] maxKDistinct(int[] nums, int k) {
//        int []arr = Arrays.copyOf(nums,nums.length);

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list , Collections.reverseOrder());
        int size = Math.min(k, list.size());
        int []res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
