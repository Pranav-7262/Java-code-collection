package SlidingWindow;

import java.util.HashMap;

public class SubarrayAtmostKDistinct {

    public static void main(String[] args) {
   int [] arr = {1, 2, 1, 1, 3, 3, 4, 2, 1};
        System.out.println(countAtMostK(arr,2));
    }
    public static int countAtMostK(int arr[], int k) {
        int n = arr.length;
        int start = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int end = 0; end < n; end++) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > k) {
                map.put(arr[start], map.getOrDefault(arr[start], 0) - 1);
                if (map.get(arr[start]) == 0) {
                    map.remove(arr[start]);
                }
                start++;
            }
            if (map.size() <= k) {
                count += end - start + 1;
            }
        }
        return count;
    }

}
