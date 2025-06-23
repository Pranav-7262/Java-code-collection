package Hashing;

import java.util.*;

public class SortArrayByIncreaseFreq {
    public static void main(String[] args) {
 int []arr = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
    public static int[] frequencySort(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer[]arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr,(a,b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA==freqB){
                return b-a;// Sort by value in descending order
            }
            return freqA-freqB;// Sort by frequency in ascending order
        });
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

    }
}
