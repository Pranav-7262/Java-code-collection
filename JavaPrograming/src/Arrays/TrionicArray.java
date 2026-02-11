package Arrays;

public class TrionicArray {
    public static void main(String[] args) {
     int [] arr = {1,3,5,4,2,6};
        System.out.println(isTrionic(arr));
    }
    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 4) return false;
        boolean[] left = new boolean[n];
        left[0] = true;
        for (int i = 1;i < n;i++) {
            if (nums[i] > nums[i - 1] && left[i - 1]) {
                left[i] = true;
            } else {
                left[i] = false;
            }
        }
        boolean[] right = new boolean[n];
        right[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1] && right[i + 1]) {
                right[i] = true;
            } else {
                right[i] = false;
            }
        }

        for (int p = 1; p < n - 2; p++) {
            if (!left[p]) continue;

            for (int q = p + 1; q < n - 1; q++) {
                if (!right[q]) continue;

                boolean isDecreasing = true;
                for (int k = p + 1; k <= q; k++) {
                    if (nums[k] >= nums[k - 1]) {
                        isDecreasing = false;
                        break;
                    }
                }

                if (isDecreasing) {
                    return true;
                }

            }
        }
        return false;
    }
}
