package SlidingWindow;

import java.util.ArrayList;
import java.util.TreeMap;

public class LongestBoundedDiffSubarray {
    public static void main(String[] args) {
   int[]arr = {8, 4, 5, 6, 7};
   int x = 3;
        System.out.println(longestSubarray(arr,x ));
    }
    public static ArrayList<Integer> longestSubarray (int[] arr, int x) {
        int start = 0 , end = 0 ,maxlen = 0 , bestS = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while (end < arr.length) {
            map.put(arr[end] , map.getOrDefault(arr[end] , 0)+1);

            while (map.lastKey() - map.firstKey() > x){
                map.put(arr[start] , map.getOrDefault(arr[start],0)-1);
                if (map.get(arr[start]) == 0){
                    map.remove(arr[start]);
                }
                start++;
            }
            if (end - start +1 > maxlen){
                maxlen = end-start+1;
                bestS = start;
            }
            end++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < maxlen; i++) {
            list.add(arr[bestS + i]);

        }
        return list;
    }
}
