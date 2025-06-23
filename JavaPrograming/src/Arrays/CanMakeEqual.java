package Arrays;

public class CanMakeEqual {
    public static void main(String[] args) {
     int []arr = {1, -1, 1, -1, 1};
     int k = 3;
        System.out.println(canMakeEqual(arr,k));
    }
    public static boolean canMakeEqual(int[] nums, int k) {
        return canConvert(nums, k, 1) || canConvert(nums, k, -1);
    }
    private static boolean canConvert(int[] nums, int k, int target) {
            int n  = nums.length;
            int []arr = nums.clone();
            int op = 0;
        for (int i = 0; i < arr.length-1; i++) {
             if (arr[i] != target) {
                 arr[i] *= -1;
                 arr[i+1] *= -1;
                 op++;
                 if (op > k){
                     return false;
                 }
             }
        }
        return arr[arr.length-1]==target;
    }
}
