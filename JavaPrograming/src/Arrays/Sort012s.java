package Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
       sortColors(arr);
       for (int num:arr){
           System.out.print(num+" ");
       }
    }
    public static void sortColors(int[] nums) {
        int s=0,m=0;
        int h = nums.length-1;
        while (m<=h){
            if (nums[m] ==0){
                swap(nums,s,m);
                s++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            }
            else {
                swap(nums,m,h);
                h--;
            }

        }
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
