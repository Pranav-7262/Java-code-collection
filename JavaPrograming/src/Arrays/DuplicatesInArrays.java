package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArrays {
    public static void main(String[] args) {
         int []arr= {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                arr.add(index+1);
            }
            nums[index] = -nums[index];

        }
        return arr;


    }
}
