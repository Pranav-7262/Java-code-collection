package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountPairsSum {
    public static void main(String[] args) {
    int [] arr = {1, 5, 7, -1, 5};
        System.out.println(countPairs(arr,6));
    }
    public static int countPairs(int arr[], int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int num:arr){
            int c = target-num;
            if (map.containsKey(c)){
                count += map.get(c);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}
