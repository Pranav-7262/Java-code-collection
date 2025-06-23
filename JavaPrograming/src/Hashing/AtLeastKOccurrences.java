package Hashing;

import java.util.HashMap;

public class AtLeastKOccurrences {
    public static void main(String[] args) {
    int [] arr = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(arr,2));
    }
    public static int firstElementKTime(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

            if (map.get(num)==k){
                return num;
            }
        }
        return -1;
    }
}
