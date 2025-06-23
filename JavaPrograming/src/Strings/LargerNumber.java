package Strings;

import java.util.Arrays;

public class LargerNumber {
    public static void main(String[] args) {
     int []arr = {3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String []arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        if (arr[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
