package Arrays;

import java.util.Arrays;

public class KthSmaller {
    public static void main(String[] args) {
      int []arr = {1,2,3,4,5,6};
      int k=2;
        System.out.println(kthSmallest(arr, k));
    }
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
