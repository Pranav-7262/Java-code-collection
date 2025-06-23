package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int []arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
      int n = nums.length;
      int curr_cnt = 0;
      int max_cnt = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==1){
              curr_cnt++;
              max_cnt = Math.max(max_cnt,curr_cnt);

            }
            else {
                curr_cnt=0;
            }
        }
        return max_cnt;

    }
}
