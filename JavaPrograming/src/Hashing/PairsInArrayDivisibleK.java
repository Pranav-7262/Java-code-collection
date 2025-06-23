package Hashing;

import java.util.HashMap;

public class PairsInArrayDivisibleK {
    public static void main(String[] args) {
     int []arr = {2, 2, 1, 7, 5, 3};
     int k = 4;
        System.out.println(countKdivPairs(arr,k));
    }
    public static long countKdivPairs(int arr[], int k) {
        long count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            int rem = num % k;
            int complement = (k - rem) % k;

            count += map.getOrDefault(complement,0);
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}

