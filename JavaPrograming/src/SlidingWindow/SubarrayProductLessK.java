package SlidingWindow;

public class SubarrayProductLessK {
    public static void main(String[] args) {
        long [] arr = {1, 2, 3, 4};
        System.out.println(countSubArrayProductLessThanK(arr,4,10));
    }
    public static long countSubArrayProductLessThanK(long arr[], int n, long k) {
        long pro = 1;

        int start = 0;
        long count = 0;

        for(int end=0;end<n;end++) {
            pro = pro*arr[end];

            while (pro >= k && start <= end) {
                pro /= arr[start];
                start++;
            }

            count+= end-start+1;

        }
        return count;
    }
}
