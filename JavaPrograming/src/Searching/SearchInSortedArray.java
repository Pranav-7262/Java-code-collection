package Searching;

public class SearchInSortedArray {
    public static void main(String[] args) {
     int [] arr = {5,1,3};
     int target = 5;
        System.out.println(search(arr,target));
    }
    public static int search(int []nums , int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]) {
                return mid;
            }
            if (nums[start] <= nums[mid]){
                if (target>= nums[start] && target< nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else {
                if (target <= nums[end] && target > nums[mid]){
                  start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;

    }
}
