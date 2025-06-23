package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
      int []nums = {2,3,4,5,7,8,9};
      int k = 1;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
    public static int[] rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    }
    static void reverse(int []nums,int start,int end){

        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
