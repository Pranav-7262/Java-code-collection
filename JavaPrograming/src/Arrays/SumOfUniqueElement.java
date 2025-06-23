package Arrays;

public class SumOfUniqueElement {
    public static void main(String[] args) {
    int [] arr = {2,7,2,1,3};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        int []arr = new int[101];
        int total_sum = 0;
        int n = nums.length;
        for(int num:nums){
            arr[num]++;
        }
        for(int num:nums) {
            if (arr[num]==1) {
                total_sum+= num;
            }
        }
        return total_sum;
    }
}
