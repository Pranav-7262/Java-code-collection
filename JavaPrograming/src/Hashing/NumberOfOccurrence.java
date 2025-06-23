package Hashing;

import java.util.HashMap;

public class NumberOfOccurrence {
    public static void main(String[] args) {
   int [] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(countFreq(arr,4));
    }

   public static  int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (map.containsKey(target)){
            return map.get(target);
        }
       return 0;
    }
}
