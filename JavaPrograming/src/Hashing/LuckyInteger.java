package Hashing;

import java.util.HashMap;

public class LuckyInteger {
    public static void main(String[] args) {
     int [] arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = -1;
        for (int key:map.keySet()){
            if (map.get(key) == key){
                result = Math.max(result,key);
            }
        }
        return result;
    }
}
