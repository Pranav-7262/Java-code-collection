package Arrays;

public class MinIncrease {
    public static void main(String[] args) {
     int []arr = {5,2,1,4,3};
        System.out.println(minIncrease(arr));
    }

    public static long minIncrease(int[] nums) {

        return Math.min(calc(nums, 1), calc(nums, 2));
    }

    private static long calc(int[] nums, int start) {
        int[] arr = nums.clone();
        int cost = 0;
        for (int i = start; i < arr.length - 1; i += 2) {
            int target = Math.max(arr[i - 1], arr[i + 1]) + 1;

            if (arr[i] < target) {
                cost += target - arr[i];
                arr[i] = target; // simulate
            }
        }
        return cost;
    }

}
