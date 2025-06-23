package Searching;

public class SingleNumberInSortArray {
    public static void main(String[] args) {
   int [] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s<e){
            int mid = s + (e-s)/2;
            if (mid%2==0){
                if (arr[mid]==arr[mid+1]){
                    s = mid+2;
                }
                else{
                    e = mid;
                }
            }
            else {
                if (arr[mid]==arr[mid-1]){
                    s = mid+1;
                }
                else{
                    e = mid;
                }
            }
        }
        return arr[s];
    }
}
