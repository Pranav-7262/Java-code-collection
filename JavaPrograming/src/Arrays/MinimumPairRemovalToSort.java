package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemovalToSort {
    public static void main(String[] args) {
       int [] arr = {5,2,3,1};
        System.out.println(minimumPairRemoval(arr));
    }
    public static int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        List<Integer> list  = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int op = 0;
        while (!isNonDecreasing(list)) {
           int index = 0;
           int mini = Integer.MAX_VALUE;
            for (int i = 0; i < list.size()-1; i++) {
                int sum = list.get(i) + list.get(i+1);
                if (sum < mini) {
                    mini = sum;
                    index = i;
                }
            }
            list.set(index,mini);
            list.remove(index+1);
            op++;
        }
        return op;
    }
    private static boolean isNonDecreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
