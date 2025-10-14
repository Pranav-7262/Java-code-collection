package SlidingWindow;

public class LongestSubarrayLenWithSumK {
    public static void main(String[] args) {
   int [] arr = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK(arr,3));
    }
    public static int longestSubarrayWithSumK(int []arr, long k) {
        int n = arr.length;
        int start = 0;
        long sum = 0;
        int maxlen = -1;
        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum  == k) {
                maxlen = Math.max(maxlen,end-start+1);
            }

        }
        return maxlen == 0 ? -1 : maxlen;
    }
}
