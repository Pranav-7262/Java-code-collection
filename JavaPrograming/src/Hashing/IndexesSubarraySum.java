package Hashing;

import java.util.ArrayList;

public class IndexesSubarraySum {
    public static void main(String[] args) {
     int []arr = {1, 2, 3, 7, 5};
     int target = 12;
        System.out.println(subarraySum(arr, target));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
}
