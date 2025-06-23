package Hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoSumPair {
    public static void main(String[] args) {
   int []arr = {1, 2, 4, 3, 6};
        System.out.println(twoSum(arr,11));
    }
    public static  boolean twoSum(int arr[], int target) {
        Set<Integer>set = new HashSet<>();
        for (int num:arr){
            if (set.contains(target-num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
