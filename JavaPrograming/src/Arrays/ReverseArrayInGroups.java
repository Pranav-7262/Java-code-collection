package Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
      int []arr = {1, 2, 3, 4, 5};
      reverseInGroups(arr,3);
    }
    public static void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k >= n){
            reverse(arr , 0 , n-1);
            return;
        }
        for(int i=0;i<n;i+=k) {
            int left = i;
            int right = Math.min(i+k-1 , n-1);
            reverse(arr , left , right);
        }


    }
    private static  void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
