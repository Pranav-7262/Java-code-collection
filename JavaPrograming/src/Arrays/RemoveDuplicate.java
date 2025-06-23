package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []nums={1,1,2};

        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
