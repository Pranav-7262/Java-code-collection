package SlidingWindow;

public class MaxSubarrayEqualProducts {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,1,1,1};
        System.out.println(maxLength(arr));
    }
    public static int maxLength(int[] nums) {
        int maxLen = -1;

        for(int i=0;i<nums.length;i++) {
            long pro = 1;
            long lcm = 1;
            int gcd = 0;

            for(int j=i;j<nums.length;j++) {
                pro *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);
                if (pro == gcd * lcm) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }

        }
        return maxLen;
    }
    private static int gcd(int a,int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    private static long lcm(long a,long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
}
