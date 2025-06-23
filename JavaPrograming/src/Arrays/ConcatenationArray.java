package Arrays;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
    int []arr = {3,5,7,8,5,8};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = n*2;
        int []arr = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i+n] = nums[i];
        }
        return arr;
    }
}
