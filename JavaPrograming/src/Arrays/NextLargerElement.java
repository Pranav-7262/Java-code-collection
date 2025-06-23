package Arrays;

import java.util.ArrayList;

public class NextLargerElement {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3};
        System.out.println(nextLargerElement(arr));
    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(-1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[j] > arr[i]){
                    arrayList.set(i, arr[j]);
                    break;
                }
            }
        }
        return arrayList;
    }
}
