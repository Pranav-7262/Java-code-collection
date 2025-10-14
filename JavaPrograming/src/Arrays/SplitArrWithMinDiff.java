package Arrays;

public class SplitArrWithMinDiff {
    public static void main(String[] args) {
      int []arr = {1,4,5,3};
        System.out.println(splitArray(arr));
    }
    public static long splitArray(int[] nums) {

        int n = nums.length;
        if (n < 2)  return -1;
        long [] psum = new long[n];
        psum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1] + nums[i];
        }
        boolean [] isIncrease = new boolean[n];
        isIncrease[0] = true;
        for (int i=1;i<n;i++) {
            isIncrease[i] = isIncrease[i-1] && nums[i] > nums[i-1];
        }

        boolean [] isDecrease = new boolean[n];
        isDecrease[n-1] = true;
        for (int i=n-2;i>=0;i--) {
            isDecrease[i] = isDecrease[i+1] && nums[i] > nums[i+1];
        }
        long minD = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < n-1; i++) {
            if (isIncrease[i]  && isDecrease[i+1]){
                long leftS = psum[i];
                long rightS = psum[n-1] - psum[i];
                long diff = Math.abs(leftS - rightS);
                minD = Math.min(minD,diff);
                found = true;
            }
        }
        return found ? minD : -1;

    }
}
