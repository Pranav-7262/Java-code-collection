package Bits;

public class CountMaxORSubsets {
    public static void main(String[] args) {
    int [] arr = {3,2,1};
        System.out.println(countMaxOrSubsets(arr));
    }
    public static int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        for(int num : nums) {
            maxOR |= num;
        }
        int n = nums.length , count = 0;
        for(int mask=1;mask<(1 << n);mask++) {
            int currOR = 0;
            for(int i=0;i<n;i++) {
                if((mask & (1 << i)) != 0) {
                    currOR |= nums[i];
                }
            }
            if(currOR == maxOR) {
                count++;
            }
        }
        return count;

    }
}
//0 0 0
//0 0 1
//0 1 0
//0 1 1
//1 0 0
//1 0 1
//1 1 0
//1 1 1