package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
      int [] arr = {12, 5, 787, 1, 23};
        System.out.println(kLargest(arr,4));
    }
    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (arr[i] > queue.peek()){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(queue);
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
}
