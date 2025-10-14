package SlidingWindow;

public class MaxSumLessThanX {
    public static void main(String[] args) {
      int [] arr = {1, 2, 3, 4, 5};
        System.out.println(findMaxSubarraySum(arr,11));
    }
    public static long findMaxSubarraySum(int[] arr, long x) {
        // Your code goes here
        long sum = 0 ,maxSum = -1;
        int n = arr.length , start = 0;

        for(int end=0;end<n;end++) {
            sum += arr[end];

            while(sum > x) {
                sum -= arr[start];
                start++;
            }

            if(sum <= x) {
                maxSum = Math.max(maxSum , sum);
            }
        }
        return maxSum;
    }
}
