
package Math;

public class MaxScoreSplit {
    public static void main(String[] args) {
   int [] arr= {10,-1,3,-4,-5};
        System.out.println(maximumScore(arr));
    }
    public static long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }
        long prefixSum = 0;
        long maxScore =  Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            long score = prefixSum - suffixMin[i + 1];
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }

}
