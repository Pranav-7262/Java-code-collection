package SlidingWindow;

public class LongestSubarrayNotDivisibleK {
    public static void main(String[] args) {
   int [] arr = {3,2,5};
        System.out.println(longestSubarrayNotDivisible(arr,5));
    }
    public static int longestSubarrayNotDivisible(int[] a, int x) {
        int n  = a.length;
        int totalSum = 0;
        for (int num : a) {
            totalSum += num;
        }
        if (totalSum % x != 0) {
            return n;
        }
        int left = -1 , right = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % x != 0) {
                if (left == -1) {
                    left = i;
                }
                right=i;
            }
        }
        if (left == -1) return -1;
        int leftRemove = n - (left+1);
        int rightRemove = right;
        return Math.max(leftRemove,rightRemove);
    }
}
