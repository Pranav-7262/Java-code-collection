package SlidingWindow;

import java.util.HashMap;

public class MaxSumSubDistinctK {
    public static void main(String[] args) {
  int [] arr = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(arr,3));
    }
    public static long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        long currS = 0;
        long maxSum = 0;

        int start = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int end = 0; end < n; end++) {
            currS += arr[end];
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            if (end - start + 1 == k) {
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, currS);
                }

                map.put(arr[start], map.get(arr[start]) - 1);
                if (map.get(arr[start]) == 0) {
                    map.remove(arr[start]);
                }

                currS -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
}
