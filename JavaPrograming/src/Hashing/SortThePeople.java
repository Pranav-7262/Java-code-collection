package Hashing;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
    String [] arr = {"Mary","John","Emma"};
    int [] arr1 = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(arr,arr1)));

    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer [] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices,(a,b) -> Integer.compare(heights[b],heights[a]));

        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = names[indices[i]];
        }
      return arr;
    }
}
