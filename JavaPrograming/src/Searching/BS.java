package Searching;

public class BS {
    public static void main(String[] args) {
        int [] arr= {12,23,34,45,56,67,78};
        int target = 67;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
         while (start <= end){
             int mid = start + (end-start)/2;
             if (arr[mid]<target){
                 start = mid+1;
             } else if(arr[mid]>target) {
                 end = mid-1;
             }
             else {
                 //required answer
                 return mid;
             }
         }
         return -1;
    }
}
