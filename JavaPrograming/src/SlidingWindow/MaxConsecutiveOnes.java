package SlidingWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
    int []arr = {1,1,1,0,0,0,1,1,1,1,0};
    int k=2;
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {
     //Using Sliding Window Approach
        int i = 0;
        int j = 0;
        while (i< nums.length){
             if (nums[i]==0){
                 k--;
             }
             if (k<0) {
                 if (nums[j] == 0) {
                     k++;
                 }
                 j++;
             }
            i++;//i  pointer is going to last index
        }
        return i-j;
    }
}
