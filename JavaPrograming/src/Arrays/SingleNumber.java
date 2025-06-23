package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int []arr = {2,2,1};
        System.out.println(singlenumber(arr));
    }
    public static int singlenumber(int []nums){
        int value = 0;
        int n  = nums.length;
        for (int i = 0; i < n; i++) {
            value = value^nums[i];
        }
        return value;

    }
}
