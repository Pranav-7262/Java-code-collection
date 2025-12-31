package Bits;

public class MaxXORSubArrayOfKSize {
    public static void main(String[] args) {
 int []arr = {2, 5, 8, 1, 1, 3};
        System.out.println(maxSubarrayXOR(arr,3));
    }
    public static int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;

        int currXor = 0;
        for (int i = 0; i < k; i++) {
            currXor ^= arr[i];
        }

        int maxXor = currXor;

        for (int i = k; i < n; i++) {
            currXor ^= arr[i - k]; // remove left element
            currXor ^= arr[i];     // add right element
            maxXor = Math.max(maxXor, currXor);
        }

        return maxXor;
    }
}
