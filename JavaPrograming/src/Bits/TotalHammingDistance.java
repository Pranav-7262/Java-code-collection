package Bits;

public class TotalHammingDistance {
    public static void main(String[] args) {
            int [] arr = {4,14,2};
        System.out.println(totalHammingDistance(arr));
    }

    public static int totalHammingDistance(int[] nums) {
            int total = 0;
            int n = nums.length;
            for (int bit = 0; bit < 32; bit++) {
                int ones = 0;
                for (int num : nums) {
                    if ((num & (1 << bit)) != 0) {
                        ones++;
                    }
                }
                int zeros = n - ones;
                total += ones * zeros;
            }
            return total;
        }
}
