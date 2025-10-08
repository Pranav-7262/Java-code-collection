package SlidingWindow;

import java.util.*;

public class CountCompleteSubarray {
    public static void main(String[] args) {
   int []arr = {1,3,1,2,2};
        System.out.println(countCompleteSubarrays(arr));
    }
    public static int countCompleteSubarrays(int[] arr) {
        int n =arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int k = set.size();
        int count = 0;
        while (j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while (map.size() == k) {
                count+=n-j;
                if (map.containsKey(arr[i])) {
                    if (map.get(arr[i]) == 1) {
                        map.remove(arr[i]);
                    } else {
                        map.put(arr[i], map.get(arr[i]) - 1);
                    }
                }
                i++;
            }
            j++;
        }
        return count;
    }
}
