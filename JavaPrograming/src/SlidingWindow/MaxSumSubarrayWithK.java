package SlidingWindow;

public class MaxSumSubarrayWithK {
    public static void main(String[] args) {
     int [] arr = {1000,200,300,400,900};
        System.out.println(max_sum(arr,3));
    }
    public static int max_sum(int []arr , int k) {
        //sliding window ....
        int n = arr.length;
        int start = 0 , sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int end = 0; end < n; end++) {
            sum += arr[end];


            if (end - start +1 == k) {
                maxSum = Math.max(maxSum,sum);
                sum = sum - arr[start];
                start++;
            }

        }
        return maxSum;
    }
}
