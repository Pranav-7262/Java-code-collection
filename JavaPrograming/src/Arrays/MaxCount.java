package Arrays;

public class MaxCount {
    public static void main(String[] args) {
  int [] arr = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] nums) {
        int n = nums.length;
        int max = -1;
        int pos=0,neg=0;
        for (int i = 0; i < n; i++) {
            if (nums[i]>0){
                pos++;
            } else if (nums[i]<0) {
                neg++;
            }
        }
        max = Math.max(pos,neg);
        return max;
    }
}
