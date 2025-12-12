package Bits;

public class MinOperationsToMakeArrayNumsEqual1 {
    public static void main(String[] args) {
   int []arr = {0,1,1,1,0,0};
        System.out.println(minOperations(arr));
    }
    public static int minOperations(int[] nums) {
        int k = 0;

        for(int i=0;i<=nums.length-3;i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                k++;
            }
        }
        for (int num : nums) {
            if (num == 0) return -1;
        }
        return k;
    }
}
