package SlidingWindow;

public class SubarraySizeKAvgGreaterThanX {
    public static void main(String[] args) {
        int [] arr = {7,7,7,7,7,7,7};
        System.out.println(numOfSubarrays(arr,7,7));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for (int end = 0; end < n; end++) {
            sum+= arr[end];
            if (end >= k-1) {

                if (sum >= k * threshold) {
                    count ++;
                }
                sum -= arr[end-k+1];
            }
        }
        return count;
    }
}
