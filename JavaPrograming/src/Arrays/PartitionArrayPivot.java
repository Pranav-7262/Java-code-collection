package Arrays;

import java.util.Arrays;

public class PartitionArrayPivot {
    public static void main(String[] args) {
   int [] arr = {9,12,5,10,14,3,10};
   int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(arr,pivot)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int []ans = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot){
                ans[c] = nums[i];
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot){
                ans[c] = nums[i];
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot){
                ans[c] = nums[i];
                c++;
            }
        }
        return ans;
    }
}
