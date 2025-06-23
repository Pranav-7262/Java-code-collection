package Arrays;

import java.util.Arrays;

public class RearrangeElements {
    public static void main(String[] args) {
 int []arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int [] positive = new int[nums.length/2];
        int [] negative = new int[nums.length/2];
        int pos=0;
        int neg=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive[pos++] = nums[i];
            }
            else {
                negative[neg++] = nums[i];
            }
        }
        int []res = new int[nums.length];
        for (int i = 0; i < nums.length/2; i++) {
            res[2*i] = positive[i];
            res[2*i+1] = negative[i];
        }

        return res;
    }

}
