package SlidingWindow;
import java.util.*;

public class DistinctNumEachWindow {
    public static void main(String[] args) {
        int [] arr = {1, 2, 1, 3, 4, 2, 3};
        System.out.println(countDistinct(arr,4));
    }
   static ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int start = 0;

        for(int end = 0; end < n; end++) {

            map.put(arr[end] , map.getOrDefault(arr[end] , 0)+1);
            if(end - start + 1 > k) {
                map.put(arr[start] , map.getOrDefault(arr[start] , 0) - 1);
                if(map.get(arr[start]) == 0) {
                    map.remove(arr[start]);
                }
                start++;
            }

            if(end - start + 1 == k) {
                list.add(map.size());
            }
        }

        return list;
    }

}
