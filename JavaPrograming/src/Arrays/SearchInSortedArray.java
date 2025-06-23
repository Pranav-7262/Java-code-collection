package Arrays;

import java.util.ArrayList;

public class SearchInSortedArray {
    public static void main(String[] args) {
   int [] arr = {23,4,5,6,7,8,1};
        System.out.println(search(arr,8));
    }
    public static int search(int[] arr, int key) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }

            return arrayList.indexOf(key);

    }
}
