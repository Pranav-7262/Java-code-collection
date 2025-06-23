package Searching;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int []nums= {4,5,6,7,0,1,2};
        System.out.println(findmin(nums));
    }
        public static int findmin(int []nums){
            int low = 0;
            int high = nums.length-1;
             while (low<high){
                 int mid = low+(high-low)/2;
                 if(nums[mid]>nums[high]){
                     low = mid+1;
                 }
                 else {
                     high=mid;
                 }
            }
             return nums[high];
        }

    }

