package Hashing;

import java.util.TreeMap;

public class MaximumRepeatingNumber {
    public static void main(String[] args) {
 int [] arr = {2, 2, 1, 2};
 int k = 3;
        System.out.println(maxRepeating(k,arr));
    }
    public static  int maxRepeating(int k, int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxcnt = 0;
        int maxnum = 0;
        for (var entry:map.entrySet()){
            if (entry.getValue()>maxcnt){
                maxcnt = entry.getValue();
                maxnum = entry.getKey();
            }
        }
        return maxnum;
    }
}
