package Hashing;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
     int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
     int [] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int j =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : arr2) {
            int count  = map.get(num);
            for (int i = 0; i < count; i++) {
                arr[j++] = num;
            }
            map.remove(num);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int c = entry.getValue();
            for (int i = 0; i < c; i++) {
                list.add(value);
            }
        }
        Collections.sort(list);
        for (int n:list) {
            arr[j++] = n;
        }
        return arr;
    }
}
