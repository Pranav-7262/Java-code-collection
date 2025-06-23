package Searching;

public class SearchInRange {
    public static void main(String[] args) {
      int [] arr = {34,56,78,90,34,23,1,45,55};
      int target = 1;
        System.out.println(linearsearch(arr,target,1,7));
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop to check the target element is found or not
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
